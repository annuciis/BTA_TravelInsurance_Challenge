import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TravelInsurancePage {
    public SelenideElement destinationDropdown() {
        return $(By.id("regionalSelectorRegion-open"));
    }

    public SelenideElement destinationSection(String destination) {
        return $(byText(destination));
    }

    public void selectTravelDestinationCountry(String country) {
        $(By.id("regionalSelectorCountry-addCountry")).click();
        $(By.xpath("//div[@class='field']//input")).sendKeys(country);
        $(By.xpath("//*[@data-value='" + country + "']")).click();
    }

    public SelenideElement selectedTravelDestinationCountry(String country) {
        return $(byXpath("//div[@class='selected-countries']//span[contains(text(), '" + country + "')]"));
    }

    public SelenideElement applySelectedTravelDestinationBtn() {
        return $(By.id("regionalSelectorCountry-applyButton"));
    }

    public SelenideElement activitiesDropdown() {
        return $(By.id("travelActivities-open"));
    }

    public SelenideElement activitySection(String activity) {
        return $(byText(activity));
    }

    public SelenideElement getOfferBtn() {
        return $(By.xpath("//button[contains(text(),'Saņemt piedāvājumu')]"));
    }
}
