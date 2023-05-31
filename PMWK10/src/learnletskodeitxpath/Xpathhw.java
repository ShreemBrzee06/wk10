package learnletskodeitxpath;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Xpathhw extends BaseTest {
    String baseUrl = "https://learn.letskodeit.com/p/practice";
    @Before
    public void setUp(){
    openBrowser(baseUrl);
    }

    @Test

    public void xpathHw(){
        driver.findElement(By.xpath("//a[@href=\"https://www.letskodeit.com/practice\"]")).click();
        driver.findElement(By.xpath("//div[@id='radio-btn-example']//label[@for='bmw']//input[@id='bmwradio']")).click();
        driver.findElement(By.xpath("//div[@id='checkbox-example-div']//label[@for='bmw']//input[@id='bmwcheck']")).click();
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        String actualMSG = driver.findElement(By.xpath("//a[@class='dynamic-link']")).getText();
        System.out.println(actualMSG);
        String expectedMSG = "PRACTICE";
        Assert.assertEquals("Verifying msg",expectedMSG,actualMSG);
        driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']")).click();
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        String homePgMsg =driver.findElement(By.xpath("//a[@href=\"/home\"]")).getText();
        System.out.println(homePgMsg);
        driver.findElement(By.xpath("//select[@id='carselect']//option[@value='benz']")).click();
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
        Select select = new Select(dropDown);
        select.selectByValue("apple");
        select.selectByValue("orange");
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("orange");
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
