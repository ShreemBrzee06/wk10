package nopcommercetestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
   String Baseurl = "https://demo.nopcommerce.com/";

   @Before
   public void setUp(){
       openBrowser(Baseurl);
   }

    @Test
public void userShouldNavigateToRegisterPageSuccessfully(){
    driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
    String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
    String expectedText = "Register";
        Assert.assertEquals("Verifying the Register Message",expectedText,actualText);
    }

    public void userShouldRegisterAccountSuccessfully(){
       driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
       driver.findElement(By.xpath("//div[@class='inputs']//div[@id='gender']//span[@class='male']//input[@id='gender-male']"));
       driver.findElement(By.id("FirstName")).sendKeys("Test");
       driver.findElement(By.id("LastName")).sendKeys("Test");
       WebElement dropDown = driver.findElement(By.xpath("//div[@class='inputs date-of-birth']"));
       Select select = new Select(dropDown);
       select.selectByValue("5");
       select.selectByValue("November");
       select.selectByValue("1980");
       driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("softwaretesting@gmail.com");
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test12345");
       driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("test12345");
       driver.findElement(By.id("register-button")).click();
       String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
       String expectedText = "Your registration completed";
       Assert.assertEquals("Verifying the Register Message",expectedText,actualText);

    }


    @After
    public void closeDown(){
       closeBrowser();
    }
}
