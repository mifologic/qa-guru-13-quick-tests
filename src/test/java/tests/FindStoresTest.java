package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.StoresPage;


public class FindStoresTest extends TestBase {

    StoresPage storesPage = new StoresPage();
    String address = "Ленинградское";
    String storeOneName = "ТЦ «Лига»";
    String storeTwoName = "ТРК «Метрополис»";

    @Test
    @DisplayName("Поиск магазинов")
    public void storesShouldBeFoundByAddress() {
        storesPage.openStoresPage()
                .addStreetName(address)
                .checkStoresInList(storeOneName, storeTwoName);
    }
}
