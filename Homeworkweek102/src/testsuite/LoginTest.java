package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }
}
