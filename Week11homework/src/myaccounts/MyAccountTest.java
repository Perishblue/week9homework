package myaccounts;

import browsertest.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountTest extends BaseTest {
    String baseURL = "https://tutorialsninja.com/demo/index.php";

    @Before
    public void setupTest() {
        openBrowser(baseURL);
    }
    public void selectMyAccountOptions (String option){
      driver.findElement(By.linkText(option)).click();
    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
       WebElement myAccountLink = driver.findElement(By.xpath("//span[text()='My Account']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(myAccountLink).build().perform();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        WebElement myAccountLink = driver.findElement(By.xpath("//span[text()='My Account']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(myAccountLink).build().perform();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        WebElement myAccountLink = driver.findElement(By.xpath("//span[text()='My Account']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(myAccountLink).build().perform();
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Perish");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Blue");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("darshanvisnudas@gmail.com");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("012345678");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Perish12");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Perish12");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Perish");
    }

}
