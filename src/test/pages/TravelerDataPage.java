import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TravelerDataPage {
    public SelenideElement firstName() {
        return $(By.id("travelerFirstName0-text"));
    }

    public SelenideElement lastName() {
        return $(By.id("travelerLastName0-text"));
    }

    public SelenideElement identifyNumber() {
        return $(By.id("travelerIdentityNumber0-text"));
    }
}
