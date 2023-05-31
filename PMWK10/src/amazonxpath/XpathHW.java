package amazonxpath;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class XpathHW extends BaseTest {
    String baseUrl = "https://www.amazon.co.uk/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_help";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test

    public void xpathHw(){
    driver.findElement(By.xpath("//a[@href=\"javascript: void(0)\"]")).click();
    driver.findElement(By.xpath("//a[@href=\"/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2\"]")).click();
    String actualMsg= driver.findElement(By.xpath("//a[@role ='link']")).getText();
    System.out.println(actualMsg);
    driver.findElement(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']"));
    boolean isDisplayed =driver.findElement(By.xpath("//img[@class='a-dynamic-image p13n-sc-dynamic-image p13n-product-image']")).isDisplayed();
        System.out.println(isDisplayed);
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        driver.findElement(By.linkText("The Glucose Goddess Method: Your four-week guide to cutting…")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Testfirstname");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("testing@gmail.com");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("test12345");
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("test12345");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }

    @After
    public void tearDown(){
      //  closeBrowser();
    }
}
