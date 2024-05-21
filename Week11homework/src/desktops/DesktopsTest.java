package desktops;

import browsertest.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsTest extends BaseTest {
    String baseURL = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setupTest() {
        openBrowser(baseURL);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllDesktops')]")).click();
        driver.findElement(By.xpath("//option[text()='Name (Z - A)']")).click();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllDesktops')]")).click();
        driver.findElement(By.xpath("//option[text()='Name (A - Z)']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'caption')]/h4//a[contains(text(),'HP LP3065')]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'input-group date')]//input[@value='2011-04-22']")).clear();
        WebElement DeliveryDate = driver.findElement(By.xpath("//div[contains(@class,'input-group date')]//input[@value='2011-04-22']"));
        DeliveryDate.sendKeys("2022-11-30");
        driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input[@id='input-quantity']")).clear();
        WebElement Qty =driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input[@id='input-quantity']"));
        Qty.sendKeys("1");
        driver.findElement(By.xpath("//div[contains(@class,'form-group')]//button[@id='button-cart']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
        driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/cart");

            }
        }