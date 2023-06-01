package orangehrmlivetestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
 String baseUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

   String actualTitleOfThePage = driver.getTitle();
   System.out.println(actualTitleOfThePage);
   String expectedTitleOfThePage = "OrangeHRM";
   Assert.assertEquals("Verifying the Title Page",expectedTitleOfThePage,actualTitleOfThePage);
    }

    @After
public void tearDown(){
        closeBrowser();
    }

}
