package comsaucedemotestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";
    @Before
    public void setUp(){
    openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValid(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actualTitle = driver.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println(actualTitle);
        String expectedTitle  = "Products";
        Assert.assertEquals("verifying the Title Msg:",expectedTitle ,actualTitle);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Boolean productDisplay = driver.findElement(By.id("inventory_container")).isDisplayed();
        System.out.println(productDisplay);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
