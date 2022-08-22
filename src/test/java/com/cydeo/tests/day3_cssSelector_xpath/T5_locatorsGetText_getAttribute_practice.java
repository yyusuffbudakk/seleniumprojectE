package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_locatorsGetText_getAttribute_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement logInBox = driver.findElement(By.cssSelector("input[class='login-inp']"));
        logInBox.sendKeys("incorrect");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();

        WebElement errorLabel = driver.findElement(By.className("errortext"));


        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = errorLabel.getText();

        if (actualErrorLabel.equals(expectedErrorLabel)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }


}
/*
    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
    1- Open a chrome browser
    2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    3- Enter incorrect username into login box:
    4- Click to `Reset password` button
    5- Verify “error” label is as expected
    Expected: Login or E-mail not found
    PS:
 */