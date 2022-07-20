package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class ChangeCityTest extends TestBase {

    MainPage mainPage = new MainPage();
    String city = "Нижний Новгород";

    @Test
    @DisplayName("Изменение города")
    public void userCanChangeCity() {
        mainPage.openMainPage()
                .openSelectCityForm()
                .addCity(city)
                .checkCityChange(city);
    }
}
