package pages;

import base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class FiltersAndPhoneViewPage extends BasePage {

    public FiltersAndPhoneViewPage() {
        PageFactory.initElements(factory, this);
    }

    @FindBy(xpath = "//h3[@data-slot='Kolor']")
    private WebElement colour;

    @FindBy(xpath = "//article[@data-item='true']")
    private List<WebElement> phoneList;

    @FindBy(xpath = "//section[@class = '_9c44d_3pyzl']//div[@class='msa3_z4 _9c44d_2K6FN']/child::span[@class='_1svub _lf05o' ]")
    private List<WebElement> priceList;

    @FindBy(id = "opbox-listing--base")
    private WebElement sectionList;

}
