package nopcommercegiftcardsxpathhw;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class XpathHW extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/gift-cards";
    @Before
    public void setUp(){
        openBrowser(baseurl);
    }
    @Test
    public void xpathHW(){
        String giftcardsMsg =driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
        System.out.println(giftcardsMsg);
       WebElement dropdown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(dropdown);
        select.selectByValue("5");
        driver.findElement(By.xpath("//select[@id='products-pagesize']//option[@value='3']")).click();
       // driver.findElement(By.xpath("//div[@class='add-info']//div[@class='buttons']//button[@fdprocessedid='6ybfme']")).click();
        driver.findElement(By.xpath("//a[@class='viewmode-icon grid selected']")).click();
        driver.findElement(By.xpath("//a[@class='viewmode-icon list']")).click();
       // driver.findElement(By.xpath("//a[@href=\"/manufacturer/all\"]")).click();
       driver.findElement(By.xpath("//h2[@class='product-title']//a[@href=\"/50-physical-gift-card\"]")).click();
       //driver.findElement(By.xpath("//a[@href=\"/25-virtual-gift-card\"]")).click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
