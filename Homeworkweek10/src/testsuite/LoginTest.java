package testsuite;

import browserfactory.BestTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class LoginTest extends BestTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }
    @Test
    public void clickOnElement() {
        WebElement element = driver.findElement(By.className("ico-login"));
        element.click();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement element = driver.findElement(By.className("ico-login"));
        element.click();
        driver.findElement(By.id("Email")).sendKeys("mmmmm@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("cash@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
    @Test
    public void verifyTheErrorMessage() {
        WebElement element = driver.findElement(By.className("ico-login"));
        element.click();

        driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Abcd@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
}