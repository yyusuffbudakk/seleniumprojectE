package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";

        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification Passed!!");
        } else {
            System.out.println("Header text verification Failed!!");
        }

        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)) {
            System.out.println("Placeholder text verification Passed!");
        } else {
            System.out.println("Placeholder text verification Failed!");
        }

        driver.close();

    }

}
/*
    TC #5: getText() and getAttribute() method practice
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/registration_form
    3- Verify header text is as expected:
    Expected: Registration form
    4- Locate “First name” input box
    5- Verify placeholder attribute’s value is as expected:
    Expected: first name
 */