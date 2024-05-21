package testsuite;

import browserfactory.BestTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BestTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }

    @Test
    public void ClickOnRegister(){
        WebElement element = driver.findElement(By.className("ico-register"));
        element.click();
        WebElement fname = driver.findElement(By.id("FirstName"));
        fname.sendKeys("Goodboy");

        WebElement lname = driver.findElement(By.id("LastName"));
        lname.sendKeys("patidar");

        WebElement days = driver.findElement(By.name("DateOfBirthDay"));
        Select day = new Select(days);
        day.selectByVisibleText("15");

        WebElement months = driver.findElement(By.name("DateOfBirthMonth"));
        Select month = new Select(months);
        month.selectByVisibleText("May");

        WebElement years = driver.findElement(By.name("DateOfBirthYear"));
        Select year = new Select(years);
        year.selectByVisibleText("1998");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("xyz@gamil.com");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("acb9876");

        WebElement password1 = driver.findElement(By.id("ConfirmPassword"));
        password1.sendKeys("abc9876");

        WebElement regbutton = driver.findElement(By.id("register-button"));
        regbutton.click();
}

    }

