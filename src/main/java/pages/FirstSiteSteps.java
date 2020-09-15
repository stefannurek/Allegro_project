package pages;

public class FirstSiteSteps extends FirstSitePage {

    public FirstSiteSteps() {
        super();
    }

    public void closePopupWindow() {
        getGoFurther().click();
    }

    public String displayPageTitle() {
        return driver.getTitle();
    }

    public void mobilePhoneSearch(String name) {
        getSearchInput().sendKeys(name);
        getFirstOptionFromList().click();
    }
}
