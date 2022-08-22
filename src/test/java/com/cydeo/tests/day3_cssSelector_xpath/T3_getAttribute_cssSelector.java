package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");


        //                   tagName[attribute='value']
        //                   input[class='login-btn']
        //WebElement actualValue = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement actualValue = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement actualValue = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedValue = "Log In";
        String actualButtonText = actualValue.getAttribute("value");
        //String actualValue = driver.findElement(By.className("login-btn")).getAttribute("value");


        if (actualValue.equals(expectedValue)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("actualButtonText = " + actualButtonText);


    }

}
/*
    TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Verify “Log in” button text is as expected:
    Expected: Log In
 */