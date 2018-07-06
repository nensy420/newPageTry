package launched;

import org.openqa.selenium.WebDriver;

public class Browser {

    public static void open() {

        WebDriver webDriver = Driver.setWebDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
    }

    public static void close() {

        Driver.setWebDriver().quit();
    }
}
