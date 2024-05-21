package testsuite1;

import browserfactory.BestTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BestTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
    }
}
