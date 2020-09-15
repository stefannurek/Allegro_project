package allegro_tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FiltersAndPhoneViewSteps;
import pages.FirstSiteSteps;

public class Allegro_Tests {

    private String pageTitle = "Allegro - atrakcyjne ceny";
    private String phoneModel = "Iphone 11";
    private String phoneColor = "czarny";

    private FirstSiteSteps firstSiteSteps;
    private FiltersAndPhoneViewSteps filtersSteps;

    @BeforeClass
    public void setUpBeforeClass() {
        BasePage.initConfiguration();
        firstSiteSteps = new FirstSiteSteps();
        filtersSteps = new FiltersAndPhoneViewSteps();
    }

    @AfterClass
    public void tearDown() {
        BasePage.closeBrowser();
    }

    @Test(priority = 1)
    public void verificationOpenStartPage() {
        firstSiteSteps.closePopupWindow();
        Assert.assertEquals(firstSiteSteps.displayPageTitle(),
                pageTitle);
    }

    @Test(priority = 2)
    public void searchMobilePhone() {
        firstSiteSteps.mobilePhoneSearch(phoneModel);
    }

    @Test(priority = 3)
    public void chooseColour() {
        filtersSteps.chooseColourOption(phoneColor);
    }

    @Test(priority = 4)
    public void countNumberOfPhonesPresented() {
        filtersSteps.printingPhoneCounter();
    }

    @Test(priority = 5)
    public void lookingForHighestPrice() {
        filtersSteps.printingCountHighestPrice();
    }

    @Test(priority = 6)
    public void printHighestPricePlus23() {
        filtersSteps.printingPricePlusPercent();
    }
}
