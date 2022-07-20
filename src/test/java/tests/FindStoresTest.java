package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.StoresPage;


public class FindStoresTest extends TestBase {

    StoresPage storesPage = new StoresPage();
    String address = "Ленинградское";
    String storeOneName = "ТЦ «Лига»";
    String storeTwoName = "ТРК «Метрополис»";

    @Test
    @DisplayName("Поиск магазинов по адресу")
    public void storesShouldBeFoundByAddress() {
        storesPage.openStoresPage()
                .addStreetName(address)
                .checkStoresInList(storeOneName, storeTwoName);
    }
}
