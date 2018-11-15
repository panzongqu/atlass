package src;

public class LicenseContent
{
  static String COMMON_CONTENT =   
  		  "Description=$$licenseDesc$$\n" +
		  "ServerID=$$serverid$$\n" +
		  "Organisation=epanda\n" +
		  "ContactEMail=epanda@myemail.com\n" +
		  "LicenseTypeName=COMMERCIAL\n" +
		  "NumberOfUsers=-1\n" +
		  "Subscription=true\n" +
		  "Evaluation=false\n" +
		  "PurchaseDate=2018-11-15\n" +
		  "CreationDate=2018-11-15\n" +
		  "LicenseExpiryDate=2118-11-15\n" +
		  "MaintenanceExpiryDate=2118-11-15\n" +
		  "LicenseID=LIDSEN-L10893875\n" +
		  "SEN=SEN-L10893875\n" +
		  "licenseVersion=2\n";  
  
  static String CONFLUENCE_CONTENT = 
		  "Description=Confluence (Server)\n" +
  		  "conf.LicenseEdition=ENTERPRISE\n" +
          "conf.DataCenter=true\n" +
          "conf.active=true\n" +
          "conf.NumberOfUsers=-1\n" +
          "conf.Starter=false\n" +
          "conf.LicenseTypeName=COMMERCIAL";
  
  static String JIRA_CONTENT = 
		  "Description=Jira Software (Server)\n" +
  		  "jira.LicenseEdition=ENTERPRISE\n" +
          "jira.NumberOfUsers=-1\n" +
          "jira.product.jira-software.active=true\n" +
          "jira.product.jira-software.DataCenter=false\n" +
          "jira.LicenseEdition=ENTERPRISE\n" +
          "jira.LicenseTypeName=COMMERCIAL\n" +
          "jira.product.jira-software.NumberOfUsers=-1\n" +
          "jira.DataCenter=$$data_center$$\n" +
          "jira.product.jira-software.Starter=false\n" +
          "jira.enterprise=true\n" +
          "jira.active=true\n" +
          "jira.LicenseTypeName=COMMERCIAL\n" +
          "jira.active=true";
  
  static String BITBUCKET_CONTENT = 
		  "Description=Bitbucket (Server)\n" +
  		  "stash.LicenseTypeName=COMMERCIAL\n" +
          "stash.active=true\n" +
          "stash.NumberOfUsers=-1\n" +
          "stash.Starter=false";
}