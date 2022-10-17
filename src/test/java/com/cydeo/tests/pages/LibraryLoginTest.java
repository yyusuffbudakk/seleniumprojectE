package com.cydeo.tests.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("library3.student.email"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.signInButton.click();

    }


    @Test
    public void negativeLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("asgd@gmail.com"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("asdf"));
        loginPage.signInButton.click();
    }


}
