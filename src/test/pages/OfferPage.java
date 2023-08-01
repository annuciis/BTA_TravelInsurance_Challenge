import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OfferPage {
    public SelenideElement insuranceInfoBtn(String insuranceName) {
        return $(By.xpath("//div[contains(text(), '" + insuranceName + "')]/../../button[@class='button-covered-popup']"));
    }

    public SelenideElement insuranceInfoWindow() {
        return $(By.className("covered-travel"));
    }

    public SelenideElement insuranceInfoWindowCloseBtn() {
        return $(By.className("popup-close"));
    }

    public SelenideElement continueWithOfferBtn(String insuranceName) {
        return $(By.xpath("//div[contains(text(), '" + insuranceName + "')]/../../button[contains(text(), 'Turpināt')]"));
    }
}
