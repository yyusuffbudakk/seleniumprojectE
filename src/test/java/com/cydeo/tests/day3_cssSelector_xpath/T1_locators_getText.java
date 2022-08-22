package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {

        // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement usernameInput = driver.findElement(By.name("USER_LOGIN"));
        usernameInput.sendKeys("incorrect");

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

        WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedText = "Incorrect login or password";
        String actualText = errorMessage.getText();


        if (expectedText.equals(actualText)) {
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