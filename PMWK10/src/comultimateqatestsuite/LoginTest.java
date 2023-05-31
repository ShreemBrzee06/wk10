package comultimateqatestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://courses.ultimateqa.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test

    public void userShouldNavigateToLoginPageSuccessfully(){
        driver.findElement(By.xpath("//a[@href=\"/users/sign_in\"]")).click();
        String actualMsg =driver.findElement(By.xpath("//h2[@class='page__heading']")).getText();
        System.out.println(actualMsg);
        String expectedMsg = "Welcome Back!";
        Assert.assertEquals("Veryfying Msg: ",expectedMsg,actualMsg);

    }

    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.xpath("//a[@href=\"/users/sign_in\"]")).click();
        driver.findElement(By.id("user[email]")).sendKeys("test@gmail.com");
        driver.findElement(By.id("user[password]")).sendKeys("test12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       String actualErrorMsg = driver.findElement(By.xpath("//li[@class='form-error__list-item']")).getText();
        System.out.println(actualErrorMsg);
        String expectedMsg = "Invalid email or password.";
        Assert.assertEquals("Verifying Error Msg",expectedMsg,actualErrorMsg);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
