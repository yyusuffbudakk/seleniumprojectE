package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        Thread.sleep(2000);

        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon - Etsy SE";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }

}
/*
    TC #1: Etsy Title Verification
    1. Open Chrome browser
    2. Go to https://www.etsy.com
    3. Search for “wooden spoon”
    4. Verify title:
    Expected: “Wooden spoon | Etsy”
 */