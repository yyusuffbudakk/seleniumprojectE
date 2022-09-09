package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }

    //@Ignore = "No test were found"
    @Test
    public void iframe_test() {

        //we need to switch drivers focus to Iframe

        //option #1 - id
        //driver.switchTo().frame("mce_0_ifr");

        //option #2 - index
        //driver.switchTo().frame(0);

        //option #3 - Web element Method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));


        WebElement urContentGoesHereText = driver.findElement(By.xpath("//p"));


        Assert.assertTrue(urContentGoesHereText.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());

    }

}
/*
    TC #4: Iframe practice
    1. Create a new class called: T4_Iframes
    2. Create new test and make set ups
    3. Go to: https://practice.cydeo.com/iframe
    4. Assert: “Your content goes here.” Text is displayed.
    5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */