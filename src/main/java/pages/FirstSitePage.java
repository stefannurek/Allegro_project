package pages;

import base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class FirstSitePage extends BasePage {

    public FirstSitePage() {
        PageFactory.initElements(factory, this);
    }


    @FindBy(xpath = "//button[contains(text(), 'przejdź dalej')]")
    private WebElement goFurther;

    @FindBy(xpath = "//input[contains(@data-role, 'search-input')]")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@id='suggestion-0']")
    private WebElement firstOptionFromList;

}
