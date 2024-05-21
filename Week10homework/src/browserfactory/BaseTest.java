package browserfactory;

import java.time.Duration;
/*Create the package ‘browserfactory’ and create the class
with the name ‘BaseTest’ inside the ‘browserfactory’
        package. And write the browser setup code inside the
class ‘Base Test’.*/
public class BaseTest {
    public static Webdriver driver;
    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));
    }
    public void closeBrowser(){
        driver.quit();
    }
    }
