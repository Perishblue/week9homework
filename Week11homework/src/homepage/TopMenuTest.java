package homepage;

import browsertest.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://tutorialsninja.com/demo/index.php";

@Before
    public void setupTest(){openBrowser(baseURL);}
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
     driver.findElement(By.xpath("//a[text()='Desktops']")).click();
     driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllDesktops')]")).click();
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNoteBooksPageSuccessfully(){
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllLaptops & Notebooks')]")).click();
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        driver.findElement(By.xpath("//a[text()='Components']")).click();
        driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[contains(text(),'Show AllComponents')]")).click();
    }

}
