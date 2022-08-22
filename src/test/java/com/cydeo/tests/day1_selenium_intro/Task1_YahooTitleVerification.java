package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2-Create intance of the Selenium Webriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //3- Go to "https://www.yahoo.com"
        driver.get("https://www.yahoo.com");

        //Expected: Yahoo är en del av de varumärken i Yahoo-familjen
        String expectedTitle = "Yahoo är en del av de varumärken i Yahoo-familjen";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }


        /*
        TC #1: Yahoo Title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title:
        Expected: Yahoo
         */

    }

}
