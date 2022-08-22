package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedText = "Remember me on this computer";
        String actualText = rememberMe.getText();

        if (expectedText.equals(actualText)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        WebElement forgotPassword = driver.findElement(By.linkText("FORGOT YOUR PASSWORD?"));

        String expectedText1 = "Forgot your password?";
        String actualText1 = forgotPassword.getText();

        if (expectedText1.equalsIgnoreCase(actualText1)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        String expectedHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPassword.getAttribute("href");

        if (actualHrefAttributeValue.contains(expectedHref)) {
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