package nopcommercetestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String Baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(Baseurl);
        }
        @Test
        public void loginSuccessfully(){
       WebElement clickOnLogin =driver.findElement(By.className("ico-login"));
        clickOnLogin.click();
        WebElement welcomeMessage=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Welcome, Please Sign In!";
            Assert.assertEquals("verifying Welcome Message :",expectedMessage,actualMessage);

        }
        @Test
        public void navigatetoLoginpg() {
            WebElement loginlink = driver.findElement(By.className("ico-login"));
            loginlink.click();
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("softwaretesting@gmail.com");
            WebElement password = driver.findElement(By.id("Password"));
            password.sendKeys("test12345");
            driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
            String actualLogoutTab= driver.findElement(By.linkText("Log out")).getText();
            String expectedLogoutTab = "Log out";
            Assert.assertTrue(expectedLogoutTab.equals(actualLogoutTab));
        }
        @Test
        public void verifyTheErrorMessage(){
        WebElement loginLink=driver.findElement(By.className("ico-login"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("software1testing@gmail.com");// invalid email address
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("test12345"); // valid password
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        String errorMessage = driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']")).getText();

        String expectedErrorMsg = "Login was unsuccessful.Please correct the errors and try again. No customer account found";
        Assert.assertEquals(errorMessage, "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");

        }

            @After
    public void closeDown(){
       closeBrowser();
    }
}
