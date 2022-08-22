package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        WebElement homeButton = driver.findElement(By.className("nav-link"));
        homeButton.click();

        String expectedTitle = "Practice";
        String actualtitle = driver.getTitle();

        if (expectedTitle.equals(actualtitle)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }


    }

}
/*
    TC #4: Practice Cydeo – Class locator practice
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/inputs
    3- Click to “Home” link
    4- Verify title is as expected:
    Expected: Practice
    PS: Locate “Home” link using “className” locator
 */