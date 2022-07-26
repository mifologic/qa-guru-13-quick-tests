package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class ChangeCityTest extends TestBase {

    MainPage mainPage = new MainPage();
    String city = "Нижний Новгород";

    @Test
    @AllureId("11656")
    @DisplayName("Изменение города")
    @Owner("allure8")
    public void userCanChangeCity() {
        mainPage.openMainPage()
                .openSelectCityForm()
                .addCity(city)
                .checkCityChange(city);
    }
}
