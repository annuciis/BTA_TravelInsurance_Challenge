import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePage {
    public HomePage open() {
        Selenide.open("https://www.bta.lv/");
        return this;
    }

    public void maximizePage() {
        getWebDriver().manage().window().maximize();
    }

    public void acceptCookies() {
        $(By.xpath("//button[contains(text(),'Piekrītu')]")).click();
    }

    public SelenideElement section(String sectionName) {
        return $(byText(sectionName));
    }

}
