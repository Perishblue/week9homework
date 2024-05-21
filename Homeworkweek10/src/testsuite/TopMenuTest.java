package testsuite;

import browserfactory.BestTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BestTest {
    @Test
    public void clickOnComputers() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        element.click();
    }
    @Test
    public void clickOnElectronics() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        element.click();
    }
    @Test
    public void clickOnApparel() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        element.click();
    }
    @Test
    public void clickOnDigitaldownloads() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        element.click();
    }
    @Test
    public void clickOnBooks() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]"));
        element.click();
    }
    @Test
    public void clickOnJewelry() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        element.click();
    }
    @Test
    public void clickOnGiftCards() {
        WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        element.click();
    }
    }
