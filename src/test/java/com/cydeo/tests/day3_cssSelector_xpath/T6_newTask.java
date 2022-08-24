package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_newTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement usernameBox = driver.findElement(By.name("USER_LOGIN"));
        usernameBox.sendKeys("incorrect");

        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("incorrect");

        WebElement signInButton = driver.findElement(By.className("login-btn"));
        signInButton.click();

        String expecetedText = "Incorrect login or password";

        WebElement actualErrorText = driver.findElement(By.className("errortext"));

        String actualText = actualErrorText.getText();

        if (actualText.equals(expecetedText)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }


}
/*
    TC #1: NextBaseCRM, locators and getText() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Enter incorrect username: “incorrect”
    4- Enter incorrect password: “incorrect”
    5- Click to login button.
    6- Verify error message text is as expected:
    Expected: Incorrect login or password
 */