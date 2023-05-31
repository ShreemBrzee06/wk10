package xpathorangehrmhw;

import browserfactory1.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathHW extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    @Before
    public void setUp(){
    openBrowser(baseUrl);
    }
    @Test
    public void XpathHW(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
        String actualTitlepg =driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']")).getText();
        System.out.println(actualTitlepg);
        driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
       // WebElement dropDown = driver.findElement(By.name("User Role"));
         //Select select= new Select(dropDown);
       // select.selectByValue("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Deep Patel");
        WebElement dropDownMenu = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//div[@tabindex='0']"));
        dropDownMenu.isEnabled();
       // Select select1 = new Select(dropDownMenu);
      //  select1.selectByValue("Enabled");

        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
    }


    @After
    public void tearDown(){
    closeBrowser();
    }

}
