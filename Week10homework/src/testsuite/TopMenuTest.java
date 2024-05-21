package testsuite;

import browserfactory.BaseTest;

/*Create the package ‘testsuite’ and create the following
classes inside the ‘testsuite’ package.

        1. LoginTest
2. TopMenuTest
3. RegisterTest*/
public class TopMenuTest extends BaseTest {
    public void clickOnElement(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void sendTextToElement(By by, String text) {
        WebElement element=driver.findElement(by);
        element.sendKeys(text);
    }
}
