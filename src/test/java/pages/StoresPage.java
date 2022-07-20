package pages;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class StoresPage {

    @Step("Открыть список магазинов")
    public StoresPage openStoresPage() {
        open("/stores/moscow/");
        return this;
    }

    @Step("Ввести название улицы")
    public StoresPage addStreetName(String address) {
        $("[data-selenium=\"smShopsFiltersSearch\"] input").setValue(address);
        return this;
    }

    @Step("Проверить наличие магазинов в списке")
    public void checkStoresInList(String storeOneName, String storeTwoName) {
        $$("[data-selenium=\"shopsList\"] li")
                .should(CollectionCondition.texts(storeOneName, storeTwoName));
    }
}
