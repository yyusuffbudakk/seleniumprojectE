package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        String expectedLabelName = "Remember me on this computer";

        WebElement actualLabelName = driver.findElement(By.className("login-item-checkbox-label"));

        String actualLabelText = actualLabelName.getText();

        if (actualLabelText.equals(expectedLabelName)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        String expectedForgotPasswordLabel = "Forgot your password?";

        WebElement actualForgotPassword = driver.findElement(By.className("login-link-forgot-pass"));

        String actualForgotPasswordLabel = actualForgotPassword.getText();

        if (expectedForgotPasswordLabel.equalsIgnoreCase(actualForgotPasswordLabel)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        String expectedHrefAttributeText = "/?forgot_password=yes";

        WebElement actualHrefAttribute = driver.findElement(By.className("login-link-forgot-pass"));

        String actualHrefAttributeText = actualHrefAttribute.getAttribute("href");

        if (actualHrefAttributeText.contains(expectedHrefAttributeText)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }


    }
}
/*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Verify “remember me” label text is as expected:
    Expected: Remember me on this computer
    4- Verify “forgot password” link text is as expected:
    Expected: Forgot your password?
    5- Verify “forgot password” href attribute’s value contains expected:
    Expected: forgot_password=yes
 */