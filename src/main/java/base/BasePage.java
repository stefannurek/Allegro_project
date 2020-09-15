package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    protected static AjaxElementLocatorFactory factory;

    public static void initConfiguration() {

        if (Settings.BROWSER.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.get(Settings.URLSITE);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Settings.implicitwait, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 30);

            factory = new AjaxElementLocatorFactory(driver, 10);
        }
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
