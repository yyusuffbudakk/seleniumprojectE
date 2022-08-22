package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Facebook2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        WebElement usernameBox = driver.findElement(By.name("email"));
        usernameBox.sendKeys("incorrect");


        WebElement passwordBox = driver.findElement(By.name("pass"));
        passwordBox.sendKeys("incorrect" + Keys.ENTER);

        Thread.sleep(3000);

        String expectedTitle = "Facebook'a Giriş Yap";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }

}
/*
    TC #2: Facebook incorrect login title verification
    1. Open Chrome browser
    2. Go to https://www.facebook.com
    3. Enter incorrect username
    4. Enter incorrect password
    5. Verify title changed to:
    Expected: “Log into Facebook”
 */