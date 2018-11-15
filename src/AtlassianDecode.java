package src;

import java.util.Properties;

public class AtlassianDecode {

	public static void main(String[] args) {
		Properties p = new Properties();
		LicenseDecode de = new LicenseDecode();
		if(!de.canDecode(cowd))
		{
			return;
		}
		
		p = de.doDecode(cowd);
		
        for (Object key : p.keySet()) { 
            System.out.println(key + "=" + p.get(key)); 
        } 
	}
	final static String jiraLicense = 
			"AAABWg0ODAoPeNp1kV9PgzAUxd/5FE180YcSKHPDJU2c0AcW9ieAPvlSu7"
			+ "tZAwVLWdRPLwOJ022Ptz339HdOr7IGUAgCkTEi3nTkT0d3KEgzRBx3Yi"
			+ "2b4gX0avtYg64pdq2gVIYLs+QF0K9S7d6biqv7XcFlbouysN6k5naly0"
			+ "0jjH0YsCg12Cc+ne7kdN1o8cprCLkBegDALsFkYsVSgKoh+6ygezlYLR"
			+ "YsCaJZPFyxj0rqz2HPx46LyXigZYsW7yxuCnoPOgrpw8S/xc6aEBxnzM"
			+ "fp3PUuZUkN1wY03fK8hl40QGykkaWibJmxZJ1EKbvk0ULJPVCjG7BaOG"
			+ "VAcSUupPhxbynjKEzZEseu4/sjz/OsdqJ/T1Z6x5WseQcCbdoNtwIN3f"
			+ "y/1rw3fmrbP6iJFUIttKy63XmUzFDQwqLrvqWb5ylie543nVef7DjHcR"
			+ "Pnfup3t9d/A3ai030wLAIUNXbiZC8TgR4Pol/FJD4G/p0IvvkCFGSLKn"
			+ "K+E2e4PMfJ0/ZQto+pijucX02h1";
	
	final static String bambooLicense = 
			"AAABXA0ODAoPeNp1kV9PgzAUxd/7KZr4og9dSmNkLmniBpiQMVhgM2p86b"
			+ "orNoGCBRbnp5fB0Mxsj/ffyfmde/VoFHZBYsYwpRPGJuweO8kKM2rZaC"
			+ "PyTVGMAiVBV+BtVa0Kzb1w5cXL2E88FDb5Bkz0vq7AVNyilA43w2TWlU"
			+ "EhRTZNQdcVJxZyCl0LWYciB/5d6PSzKYV+SHOhspEscrRsjPwQFbiiBn"
			+ "5wQixGGEODka9Smf0wHBNqEfYr6i1albOqCZgdGN/ls+fXO7J+8efED+"
			+ "ZjYtnTaLDdCqgd8No0cJ4khryo4YhyGXiZCd2hnka42pfQUTvRYuHFjj"
			+ "8NUOtX16CFlhfAjret8cB3Ey8kgUXHtmXfMtRW/LQTmVRoVYnuU9AGsB"
			+ "XIMdDV/+PMeuGn9neHbYZcqKRRZXfbc+DrPrUbfGDFPT3u8d8m2NuJrO"
			+ "m08dEl+mv1Kf4AzUfKODAtAhUAlF7202WUXkxoyO0FmubU7U9kq98CFD"
			+ "fOxsUm2DqOqvLvTUU+8LzUVRfHX02h5";
	
	final static String bitbucketLicense = 
			"AAABMA0ODAoPeNptUEFuwjAQvPsVkXppD0ZxCk1AstQS54AUoCXAqZfFXc"
			+ "Bq4qS2g0pfX0NAlSqktbTamZ2d8d2yxUCgDNjQ12iQjPr9IC2WQRSymA"
			+ "i00qjGqVrzsXKbVn6iC+4LNAc0D++jIDtA2cIJJ6nBcyPAIT9tUxbRKC"
			+ "RprR1IN4MK+U+td19tA/p5V4Eqe7Kurng29YObhL8b3JkWiXVg9z2/og"
			+ "7YTUolUVtco7EnVkS8lnaoQUvMvhtljldTCQ0ZZUMyNzvQynaq6O99wE"
			+ "U377SWxwbPltP5dJot0slLTrrYE8HH7LFPo7diTReDOKMLIVakyGbcP5"
			+ "qzMBnELH4iFyXPzyfiJnTbW+ejcGAcGr6F0l4zz9pqg2a+XVmflFNGXl"
			+ "sj92Dx/5//AnA3mn4wLQIVAJLNa2nZCiRgt4K4AMQ7cCl6673PAhQrUc"
			+ "IR6fuPB6mMo9RPqi3eKZ6nDQ==X02fb";
	
	final static String con = 
			"AAABQQ0ODAoPeNp1kM9LwzAUx+/5KwJe9JDRROa6QUHXFpm0m6xzePCSxd"
			+ "cZaNOaJsP515s2jqHoLe+98Pn+uMgbhRMQmIaYBTPKZizAcbFxA52guF"
			+ "GGC7PkNUSfjdq/25ar233NZTUSTY1Eo8qR+yAPEBltAT1aLd54Bwk3EP"
			+ "UIQhmhU5RJAaqD9KOV+ng6hiSghIYnlTR32D9lCtAH0IskmrPsnoyv51"
			+ "syWU+eCbvZPngPDsljUAa091HYXSe0bI1slN84uDsrrsQ/LgbO0tY70K"
			+ "vyqQPdRYT6bWG47tElrzo4ZXF2skVSpEuS0SAcB3RKkZuin5uV3nMlOz"
			+ "4YARfrlaNYwzD/LmnQ+qZvji0MtcerPE/X8eIuQ5U/bZ21nsZQAueQrs"
			+ "SysuDi4cu+DezruHqZ4fTAKzsoovPTt/IFXEGpATAsAhRI6ZSS0BlnEJ"
			+ "pV6TGr7sTjkcS46QIUUx0FGLfuHtB0k69uprm3TUu0lVo=X02g0";
	
	final static String cowd = 
			"AAABLw0ODAoPeNptkDFPwzAQhXf/CkssMLiKTaMmlSwBiYdA0qKmMLEY99"
			+ "pGSpzgOIXy63GaVAjU4ZZ79757d1frfYdjUJgFmNH5dDr3Axzla8w8Ok"
			+ "MxtMoUjS1qzSNTf27wdQ7mAObmbY7FQZad7DWkem0ilS0OwK3pAEUGTl"
			+ "IsLfCeRSgjLERRra2bW8gK+Hetdx9dI/XdrpJFOVF1NZJyK40Fw7eybG"
			+ "HspYUC3cL62MDJHS2zTKyi5D49Q0XmKBepv1GHdOXAegXT9j2GnFNb0F"
			+ "IrEF9NYY7n3AHxKGEBWpqd1EU7MMDRNxINr0hi/rDKpyQLhUee/IQSET"
			+ "z6KBcL7oqk1AvC22Dmj2csuuodzHL70rrlnFA03uUwaRL/dYzS5UTPnV"
			+ "F72cL/D/8AqI6YvjAsAhQERCz9q2NgE7YIuBB3ZoSwfsylYgIUNIaCMq"
			+ "5g3eKCcpr9dLCy/awPIL4=X02f7";
}