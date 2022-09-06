package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByVisibleText("Illinois");

        stateDropdown.selectByValue("VA");

        stateDropdown.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);


    }

    @Test
    public void dropdown_task6() {

        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        year.selectByVisibleText("1923");
        month.selectByValue("11");
        day.selectByIndex(0);

        String expectedYearText = "1923";
        String expectedMonthText = "December";
        String expectedDayText = "1";

        String actualYearText = year.getFirstSelectedOption().getText();
        String actualMonthText = month.getFirstSelectedOption().getText();
        String actualDayText = day.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYearText.equals(expectedYearText));
        Assert.assertEquals(actualMonthText, expectedMonthText);
        Assert.assertEquals(actualDayText, expectedDayText);

    }

    @AfterMethod
    public void teardownMethod() {
        driver.close();
    }


}
/*
    TC #5: Selecting state from State dropdown and verifying result
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
    3. Select Illinois
    4. Select Virginia
    5. Select California
    6. Verify final selected option is California.
    Use all Select options. (visible text, value, index)
 */

/*
    TC #6: Selecting date on dropdown and verifying
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Select “December 1st, 1923” and verify it is selected.
    Select year using : visible text
    Select month using : value attribute
    Select day using : index number
 */
