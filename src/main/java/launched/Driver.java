package launched;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    public static WebDriver setWebDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\home\\user\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        return driver;
    }


}
