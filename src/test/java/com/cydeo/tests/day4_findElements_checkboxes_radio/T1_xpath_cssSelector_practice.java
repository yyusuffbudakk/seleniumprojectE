package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homelink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //syntax #2
        WebElement homelink2 = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement header1 = driver.findElement(By.cssSelector("div.example > h2"));

        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header2 = driver.findElement(By.xpath("//h2[.()='Forgot Password']")); // . == class

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for ='email']"));

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name ='email']"));

        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //button[@class='radius']
        WebElement retrievePassword2 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword2.isDisplayed() = " + retrievePassword2.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


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