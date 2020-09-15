package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelper {

    private JavascriptExecutor js;

    public JavaScriptHelper(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
    }

    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickElement(WebElement element){
        js.executeScript("arguments[0].click();", element);
    }

}
