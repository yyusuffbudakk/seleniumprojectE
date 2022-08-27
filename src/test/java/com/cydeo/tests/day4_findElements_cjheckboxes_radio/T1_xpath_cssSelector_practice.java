package com.cydeo.tests.day4_findElements_cjheckboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        String homeLlink = homeLink.getText();

        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div>h2[='Forgot Password']"));
        String forgotPass = forgotPasswordHeader.getText();

        WebElement eMailText = driver.findElement(By.cssSelector("label[for='email']"));
        String eMail = eMailText.getText();

        WebElement eMailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        String eMailInput = eMailInputBox.getText();

        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        String retrievePass = retrievePassword.getText();

        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String poweredByCydeo = poweredByCydeoText.getText();

        System.out.println("forgotPass = " + forgotPass);
        System.out.println("eMail = " + eMail);
        System.out.println("eMailInput = " + eMailInput);
        System.out.println("retrievePass = " + retrievePass);
        System.out.println("poweredByCydeo = " + poweredByCydeo);


    }


}
/*
        TC #1: XPATH and cssSelector Practices
            1. Open Chrome browser
            2. Go to https://practice.cydeo.com/forgot_password
            3. Locate all the WebElements on the page using XPATH and/or CSS
            locator only (total of 6)
            a. “Home” link
            b. “Forgot password” header
            c. “E-mail” text
            d. E-mail input box
            e. “Retrieve password” button
            f. “Powered by Cydeo text
            4. Verify all web elements are displayed.
        First solve the task with using cssSelector only. Try to create 2 different
        cssSelector if possible
        Then solve the task using XPATH only. Try to create 2 different
        XPATH locator if possible
 */