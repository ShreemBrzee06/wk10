package nopcommercetestsuite;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']"));// to go on title of array list
        List<WebElement> links = driver.findElements(By.tagName("li")); // to find out how many children tag present
        int numbersOfLinks = links.size();
        System.out.println(numbersOfLinks);
        for (int i = 1; i<numbersOfLinks;i++) {//to work continuously to click on all the tab

            if (i==1) { //for computer tab
               driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[1]//a[@href=\"/computers\"]")).click();
               String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
               String expectedText="Computers";
               Assert.assertEquals("Verifying Computer Text",expectedText,actualText);
               System.out.println("I am in computer tab");
            } else if (i==2) { //for Electronics tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[2]//a[@href=\"/electronics\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText="Electronics";
                Assert.assertEquals("Verifying Electronics Text",expectedText,actualText);
                System.out.println("I am in Electronics tab");
            } else if (i==3) {//for Apparel Tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[3]//a[@href=\"/apparel\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText="Apparel";
                Assert.assertEquals("Verifying Apparel Text",expectedText,actualText);
                System.out.println("I am in Apparel tab");
            } else if (i==4) {//For Digital downloads Tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[4]//a[@href=\"/digital-downloads\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText="Digital downloads";
                Assert.assertEquals("Verifying DigitalDownload Text",expectedText,actualText);
                System.out.println("I am in Digital downloads tab");
            } else if (i==5) { // for Books Tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[5]//a[@href=\"/books\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText="Books";
                Assert.assertEquals("Verifying Books Text",expectedText,actualText);
                System.out.println("I am in Books tab");
            } else if (i==6) { //for Jewelry Tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[6]//a[@href=\"/jewelry\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText="Jewelry";
                Assert.assertEquals("Verifying jewlry Text",expectedText,actualText);
                System.out.println("I am in Jewelry tab");
            }else if (i==7) { //for Gift Cards Tab
                driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[7]//a[@href=\"/gift-cards\"]")).click();
                String actualText = driver.findElement(By.xpath("//div[@class='page-title']//h1[1]")).getText();
                String expectedText = "Gift Cards";
                Assert.assertEquals("Verifying gift cards Text", expectedText, actualText);
                System.out.println("I am in Gift Cards tab");

            }
        }
    }

    @After
    public void closeDown(){
     closeBrowser();
    }
}