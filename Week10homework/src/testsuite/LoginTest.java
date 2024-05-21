package testsuite;

import browserfactory.BaseTest;
/*Create the package ‘testsuite’ and create the following
classes inside the ‘testsuite’ package.
1. LoginTest
2. TopMenuTest
3. RegisterTest*/
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setupTest() {
        openBrowser(baseUrl);
    }
@Test
public void LoginTest(){

}


}
