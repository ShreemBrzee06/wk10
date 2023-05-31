package onlinestorexpath;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class XpathHW extends BaseTest {
    String baseUrl= " https://demostore.x-cart.com/shipping";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void onlineStoreXpathHw(){
        driver.findElement(By.xpath("//div[@class='navbar navbar-inverse mobile-hidden']//li[@class='leaf first']")).click();
        driver.findElement(By.xpath("//span[@class='input-field-wrapper input input-text-searchbox']")).click();
        //driver.findElement(By.xpath("//li[@class='leaf has-sub']//span[@class='primary-title']")).click();
       // driver.findElement(By.xpath("//a[@ href=\"https://demostore.x-cart.com/newarrivals/\"]")).click();
        //driver.findElement(By.xpath("//a[@href=\"fashion/\"]")).click();
       Boolean imgAvailable = driver.findElement(By.xpath("//img[@alt='PayPal']")).isDisplayed();
        System.out.println(imgAvailable);
        driver.findElement(By.xpath("//ul[@class='subcategory-view-icons subcategory-list grid-list clearfix length-3']//li[1]//div[@class='subcategory']//a[@href=\"https://demostore.x-cart.com/fashion/\"]")).click();
       // driver.findElement(By.xpath("//div[@class='product productid-14']//div[@class='buttons-container']//div[@class='add-to-cart-button']")).click();
        driver.findElement(By.xpath("//div[@class='product productid-14']//div[@class='buttons-container']//div[@class='add-to-cart-button']//button[@class='btn  regular-button add-to-cart product-add2cart productid-14']")).click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
