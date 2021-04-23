package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.signIn.SignIn;
import pages.signOut.SignOut;
import testdata.getExcelData;
import  pages.administration.serverConfiguration.serverConfiguration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TransferQueue;

import static testcases.configuration.driver;

/**
 * Created by sarja on 7/23/2017.
 */
public class testSignIn {

    //Declaration of  sign in page and getExcelData objects.
    SignIn objLogin;
    SignOut objSignout;
    getExcelData getExlObj;
    serverConfiguration serverConfig;






    //Test will be initiated from here by TestNG framework. This method will open facebook signIn page and sign in to facebook using
    //the specified email address and password in credential.xls
    @Test(dataProvider="Login")
    public void testtSignIn(String userName, String password) throws InterruptedException {

        //Navogate to sft signIn page
        driver.get("http://192.168.10.23/");

        //Create SFT SignIn Page object
        objLogin = new sftSignIn(driver);
        serverConfig= new serverConfiguration(driver);
        //signIn to SFT
        objLogin.signinSFT(userName, password);
        Thread.sleep(4000);
        serverConfig.clickAdministration();
        Thread.sleep(4000);
        serverConfig.clickServerconfigurationsidemenu();
        Thread.sleep(4000);
        serverConfig.clickDeliverySettings();
        Thread.sleep(4000);
        serverConfig.acceptDefaultSecureMessage();
        Thread.sleep(4000);
        serverConfig.clearDefaultSecureMessageBody();
        Thread.sleep(4000);
        serverConfig.sendKeysDefaultSecureMessageBody("Hello passed!");
        Thread.sleep(5000);


        //objSignout = new sftSignOut(driver);
       // objSignout.clickSignOut();


    }

    //Test will be initiated from here by TestNG framework. This method will read the credential.xls file and extrace email, password
    // and pass it to "test_Login" through @Dataprovider
    @DataProvider(name="sftLogin")
    public Object[][] loginData() {
        getExlObj= new getExcelData();
        Object[][] arrayObject = getExlObj.getExcelData("credential.xls","Sheet1");
        return arrayObject;
    }


}
