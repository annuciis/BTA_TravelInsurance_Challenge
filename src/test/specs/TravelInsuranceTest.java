import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class TravelInsuranceTest {
    HomePage homePage = new HomePage();
    TravelInsurancePage travelInsurancePage = new TravelInsurancePage();
    OfferPage offerPage = new OfferPage();
    TravelerDataPage travelerDataPage = new TravelerDataPage();

    @Test
    public void TestTravelInsurance() {
        homePage.open().maximizePage();
        homePage.acceptCookies();
        homePage.section("Ceļojumi").click();

        travelInsurancePage.destinationDropdown().click();
        travelInsurancePage.destinationSection("Izvēlies valstis").click();
        travelInsurancePage.selectTravelDestinationCountry("Indija");
        travelInsurancePage.selectedTravelDestinationCountry("Indija").shouldBe(visible);
        travelInsurancePage.applySelectedTravelDestinationBtn().click();
        travelInsurancePage.destinationDropdown().shouldHave(text("Visa pasaule"));
        travelInsurancePage.activitiesDropdown().click();
        travelInsurancePage.activitySection("Sports").click();
        travelInsurancePage.activitiesDropdown().shouldHave(text("Sports"));
        travelInsurancePage.getOfferBtn().click();

        offerPage.insuranceInfoBtn("Optimālā+").shouldBe(visible).click();
        offerPage.insuranceInfoWindow().shouldBe(visible);
        offerPage.insuranceInfoWindowCloseBtn().click();
        offerPage.continueWithOfferBtn("Optimālā+").click();


        travelerDataPage.firstName().shouldBe(visible).shouldBe(empty);
        travelerDataPage.lastName().shouldBe(visible).shouldBe(empty);
        travelerDataPage.identifyNumber().shouldBe(visible).shouldBe(empty);


    }
}
