package orangehrmlivetestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
String baseUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(" Admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        String actualTextMsg = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        System.out.println(actualTextMsg);
        String expectedTextMsg = "Reset Password";
        Assert.assertEquals("verifying the ResetPassword message :",expectedTextMsg,actualTextMsg);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
