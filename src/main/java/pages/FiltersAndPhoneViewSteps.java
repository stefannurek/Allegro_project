package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.DecimalFormat;


public class FiltersAndPhoneViewSteps extends FiltersAndPhoneViewPage {

    private Double maxPrice;

    public FiltersAndPhoneViewSteps() {
        super();
    }

    public void chooseColourOption(String colour) {
        driver.findElement(By.xpath("//span[contains(text(), '"
                + colour.toLowerCase() + "')]")).click();
    }

    public void printingPhoneCounter() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//article[@data-item='true']")));
        System.out.println("Liczba wyświetlonych telefonów na stronie to: " +
                getPhoneList().size());
    }

    public void printingCountHighestPrice() {
        maxPrice = 0.0;
        double currentPrice;
        // todo refactor: i=4 żeby wykluczyć wyniki sponsorowanych produktów z panelu bocznego
        for (int i = 4; i < getPriceList().size(); i++) {
            currentPrice = Double.parseDouble(getPriceList()
                    .get(i).getText().replaceAll("[^\\d.]", "")) / 100;
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
            }
        }
        System.out.println("Najwyższa cena wśród prezentowanych na stronie telefonów to: " +
                maxPrice + " zł");
    }

    public void printingPricePlusPercent() {
        if (maxPrice == null) {
            System.out.println("Najwyższa cena telefonu nie została ustalona");
            return;
        }
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Najwyższa prezentowana cena telefonu plus 23% to: " +
                f.format(maxPrice * 1.23) + " zł");
    }
}
