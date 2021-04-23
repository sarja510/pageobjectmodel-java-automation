package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.administration.serverConfiguration.serverConfiguration;
import pages.leftMenuPannel.leftMenuPanel;
import pages.signIn.sftSignIn;
import pages.signOut.sftSignOut;
import testdata.getExcelData;

import static testcases.configuration.driver;

/**
 * Created by sarja on 7/30/2017.
 */
public class testSarja {


    //Declaration of SFT sign in page and getExcelData objects.
       sftSignIn objLogin;
    sftSignOut objSignout;
    leftMenuPanel objMenu;
    serverConfiguration objUserinterface;
    serverConfiguration objOutlookConfig;

    getExcelData getExlObj;

    //Test will be initiated from here by TestNG framework. This method will open facebook signIn page and sign in to facebook using
    //the specified email address and password in credential.xls
    @Test(dataProvider = "sftLogin")
    public void testSftSignIn(String userName, String password) throws InterruptedException {

        //Navogate to sft signIn page
        driver.get("http://internal/bds");

        //Create SFT SignIn Page object
        objLogin = new sftSignIn(driver);

        //signIn to SFT
        objLogin.signinSFT(userName, password);


        objMenu = new leftMenuPanel(driver);
        objMenu.clickAdministration();

        objMenu.clickServerConfiguration();

        //objUserinterface = new serverConfiguration(driver);
        //objUserinterface.configureUserInterface("sarja","sarja","sarja","sarja","sarja","sarja","sarja","sarja","sarja","sarja");

        objOutlookConfig = new serverConfiguration(driver);
        objOutlookConfig.configureOutlookAddin("testoutlookaddin@nilavodev.com","1","test","100","1");


        objSignout = new sftSignOut(driver);
        objSignout.clickSignOut();
    }


    @DataProvider(name="sftLogin")
    public Object[][] loginData() {
        getExlObj= new getExcelData();
        Object[][] arrayObject = getExlObj.getExcelData("credential.xls","Sheet1");
        return arrayObject;
    }

}
