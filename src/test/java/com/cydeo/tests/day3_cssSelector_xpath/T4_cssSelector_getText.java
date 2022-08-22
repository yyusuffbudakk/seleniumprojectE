package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        /*
        String expectedPasswordButton = "Reset password";
        String actualPasswordButton = driver.findElement(By.className("login-btn")).getAttribute("value");

        if (actualPasswordButton.equals(expectedPasswordButton)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
        */

        WebElement passwordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedPasswordButton = "Reset password";
        String actualPasswordButton = passwordButton.getText();

        if (actualPasswordButton.equals(expectedPasswordButton)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }


    }

}
/*
    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    3- Verify “Reset password” button text is as expected:
    Expected: Reset password
 */