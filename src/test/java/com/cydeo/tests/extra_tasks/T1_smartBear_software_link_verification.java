package com.cydeo.tests.extra_tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_smartBear_software_link_verification {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void smartBear_software(){

        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        usernameBox.sendKeys("Tester");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");

        WebElement logInButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
        logInButton.click();





    }



}
/*
    TC #1: Smartbear software link verification
    1. Open browser
    2. Go to website:
    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3. Enter username: “Tester”
    4. Enter password: “test”
    5. Click to Login button
    6. Print out count of all the links on landing page
    7. Print out each link text on this page
 */