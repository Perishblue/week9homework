package homepage;

import browsertest.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://tutorialsninja.com/demo/index.php";
    private Actions actions;
    @Before
    public void setupTest() {
        openBrowser(baseURL);
    }

    public void selectMenu(String menu) {
        WebElement menuOption = driver.findElement(By.linkText(menu));
        menuOption.click();
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        Actions actions = new Actions(driver);
        WebElement Desktop = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]"));

        WebElement showme = driver.findElement(By.xpath("//a[contains(text(), \"Show AllDesktops\")]"));
        showme.click();

        WebElement welcome = driver.findElement(By.xpath("//div[@id='content']/h2"));
        String actualmessage = welcome.getText();
        String expectedmessage = "Desktops";
        Assert.assertEquals("Verifying Desktop Message",expectedmessage,actualmessage);
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully1() {
        WebElement desktopsTab = driver.findElement(By.linkText("Desktops"));
        desktopsTab.click();
        driver.findElement(By.linkText("Show AllDesktops")).click();
        actions.moveToElement(desktopsTab).build().perform();
        desktopsTab.click();
        //String expectedText = "Desktops";
        //String actualText = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
        // Assert.assertEquals(actualText,expectedText);
        WebElement welcome = driver.findElement(By.xpath("//div[@id='content']/h2"));
        String actualmessage = welcome.getText();
        String expectedmessage = "Desktops";
        Assert.assertEquals("Verifying Desktop Message",expectedmessage,actualmessage);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        WebElement laptopsAndNotebooksTab = driver.findElement(By.linkText("Laptops & Notebooks"));
        actions.moveToElement(laptopsAndNotebooksTab).build().perform();
        laptopsAndNotebooksTab.click();
        selectMenu("Show All Laptops & Notebooks");
        Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        WebElement componentsTab = driver.findElement(By.linkText("Components"));
        actions.moveToElement(componentsTab).build().perform();
        componentsTab.click();
        selectMenu("Show All Components");
        Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Components");
    }
}

