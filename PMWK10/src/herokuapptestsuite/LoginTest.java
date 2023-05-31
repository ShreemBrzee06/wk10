package herokuapptestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl= "http://the-internet.herokuapp.com/login";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.xpath("//button[@type='submit']//i[@class='fa fa-2x fa-sign-in']")).click();
    String actualMsg = driver.findElement(By.xpath("//div[@class='example']//h2[1]")).getText();
        System.out.println(actualMsg);
        String expectedMsg = "Secure Area";
        Assert.assertEquals("verify the Message: ", expectedMsg,actualMsg);
    }
    @Test

    public void verifyTheUsernameErrorMessage(){
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']//i[@class='fa fa-2x fa-sign-in']")).click();
       String actualMsg= driver.findElement(By.xpath("//div[@id='flash-messages']//div[@id='flash']")).getText();
        System.out.println(actualMsg);
        String expectedMsg = "Your username is invalid!";
        Assert.assertEquals("verify the message:",expectedMsg,actualMsg);
    }

    @Test
    public void verifyThePasswordErrorMessage(){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//button[@type='submit']//i[@class='fa fa-2x fa-sign-in']")).click();
        String actualMsg= driver.findElement(By.xpath("//div[@id='flash-messages']//div[@id='flash']")).getText();
        System.out.println(actualMsg);
       String expectedMsg = "Your password is invalid!";
       Assert.assertEquals("verify the message:",expectedMsg,actualMsg);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
