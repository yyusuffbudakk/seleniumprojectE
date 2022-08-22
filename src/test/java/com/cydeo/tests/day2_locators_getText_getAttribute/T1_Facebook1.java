package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Facebook1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }


    }

}
/*
    TC #1: Facebook title verification
    1. Open Chrome browser
    2. Go to https://www.facebook.com
    3. Verify title:
    Expected: “Facebook - Log In or Sign Up”
 */