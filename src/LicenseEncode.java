package src;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.commons.codec.binary.Base64;

public class LicenseEncode {
	
	public static final int VERSION_NUMBER_1 = 1;
	public static final int VERSION_NUMBER_2 = 2;
	public static final int VERSION_LENGTH = 3;
	public static final int ENCODED_LICENSE_LENGTH_BASE = 31;
	public static final byte[] LICENSE_PREFIX = new byte[]{13, 14, 12, 10, 15};
	public static final char SEPARATOR = 'X';
	
    static PrivateKey privateKey;

	public String doCofluenceLisenceEncode(String serverId) throws Exception {
		byte[] ziptext = zipLicenseText(getConfluenceLicenseText(serverId));
		return packLicenseContent(ziptext, getSignature(ziptext));
	}
	
	public String doJiraLicenseEncode(String serverId) throws Exception {
		byte[] ziptext = zipLicenseText(getJiraLicenseText(serverId));
		return packLicenseContent(ziptext, getSignature(ziptext));
	}
	
	public String doBitbucketLicenseEncode(String serverId) throws Exception {
		byte[] ziptext = zipLicenseText(getBitbucketLicenseText(serverId));
		return packLicenseContent(ziptext, getSignature(ziptext));
	}
	    
	private static String getConfluenceLicenseText(String serverId) {
		return LicenseContent.COMMON_CONTENT.replace("$$serverid$$", serverId) + LicenseContent.CONFLUENCE_CONTENT;
    }
    
    private static String getJiraLicenseText(String serverId) {
		return LicenseContent.COMMON_CONTENT.replace("$$serverid$$", serverId) + LicenseContent.JIRA_CONTENT;
    }
    
    private static String getBitbucketLicenseText(String serverId) {
		return LicenseContent.COMMON_CONTENT.replace("$$serverid$$", serverId) + LicenseContent.BITBUCKET_CONTENT;
    }
    
	private byte[]  zipLicenseText(String licenseText) throws Exception {
        byte[] licenseTextBytes = licenseText.getBytes("UTF-8"); 
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(out, new Deflater(Deflater.BEST_COMPRESSION));
        deflaterOutputStream.write(licenseTextBytes);
        deflaterOutputStream.close();
        byte[] licenseTextBytesZiped = out.toByteArray();
		return licenseTextBytesZiped; 
	}
	
	private static byte[] getSignature(byte[] licenseTextZiped) throws Exception {
	    Signature signature;
		signature = Signature.getInstance("SHA1withDSA");
	    signature.initSign(privateKey);
	    signature.update(LICENSE_PREFIX);
	    signature.update(licenseTextZiped);
		return signature.sign();	
	}
	
	private static String packLicenseContent(byte[] licenseTextZiped, byte[] signature) throws Exception {
		ByteArrayOutputStream e = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(e);
		out.writeInt(licenseTextZiped.length);
		out.write(licenseTextZiped);
		out.write(signature);
		out.close();
		
		byte[] allData = e.toByteArray();
		String result = (new String(Base64.encodeBase64(allData))).trim();
		result = result + SEPARATOR + "0" + VERSION_NUMBER_2 + Integer.toString(result.length(), ENCODED_LICENSE_LENGTH_BASE);
		result = split(result);
		return result;
	}
	
	private static String split(String licenseData) {
		if (licenseData != null && licenseData.length() != 0) {
			char[] chars = licenseData.toCharArray();
			StringBuffer buf = new StringBuffer(chars.length + chars.length / 76);

			for (int i = 0; i < chars.length; ++i) {
				buf.append(chars[i]);
				if (i > 0 && i % 76 == 0) {
					buf.append('\n');
				}
			}
			return buf.toString();
		} else {
			return licenseData;
		}
	}
	
    static {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("DSA");               
            privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decodeBase64(
            		"your privateKey"
            		.getBytes())));
        } catch (Exception e) {
        }
    }
}
