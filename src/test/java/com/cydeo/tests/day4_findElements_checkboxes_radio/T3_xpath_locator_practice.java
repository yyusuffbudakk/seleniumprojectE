package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_xpath_locator_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'button1()']"));
        button1.click();

        String expectedText = "Clicked on button one!";

        WebElement actualText1 = driver.findElement(By.xpath("//p[text() = 'Clicked on button one!']"));

        System.out.println("button1.isDisplayed() = " + button1.isDisplayed());


    }


}
/*
    TC #6: XPATH LOCATOR practice
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/multiple_buttons
    3. Click on Button 1
    4. Verify text displayed is as expected:
    Expected: “Clicked on button one!”
 */