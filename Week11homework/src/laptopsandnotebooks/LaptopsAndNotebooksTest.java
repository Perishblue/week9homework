package laptopsandnotebooks;

import browsertest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaptopsAndNotebooksTest extends BaseTest {
    String baseURL = "https://tutorialsninja.com/demo/index.php";
    @Before
    public void setupTest() {
        openBrowser(baseURL);
    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllLaptops & Notebooks')]")).click();
        driver.findElement(By.xpath("//option[text()='Price (High > Low)']")).click();

    }
    @Test
    public void VerifyThatUserPlaceOrderSuccessfully(){
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllLaptops & Notebooks')]")).click();
        driver.findElement(By.xpath("//option[text()='Price (High > Low)']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'caption')]/h4//a[contains(text(),'MacBook Air')]")).click();
       /* WebElement MacBookAir = driver.findElement(By.xpath("//div[contains(@class,'caption')]/h4//a[contains(text(),'MacBook Air')]"));
        Assert.assertTrue(MacBookAir.isDisplayed());
        MacBookAir.click();*/
        driver.findElement(By.cssSelector("button#button-cart")).click();
        driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");
        driver.findElement(By.xpath("//input[@value='1']")).clear();
        WebElement Quantity = driver.findElement(By.xpath("//input[@value='1']"));
        Quantity.sendKeys("2");
        driver.findElement(By.xpath("//i[@class='fa fa-refresh']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

    }
}
