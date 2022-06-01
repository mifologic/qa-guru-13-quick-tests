package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FindStoresTest extends TestBase {

    String address = "Ленинградское";

    @Test
    @DisplayName("Поиск магазинов по адресу")
    public void storesShouldBeFoundByAddress() {
        step("Открыть список магазинов", () -> open("/stores/moscow/"));
        step("Ввести название улицы", () ->
                $("[data-selenium=\"smShopsFiltersSearch\"] input").setValue(address));
        step("Проверить наличие магазинов в списке", () ->
                $$("[data-selenium=\"shopsList\"] li")
                        .should(CollectionCondition.texts("ТЦ «Лига»", "ТРК «Метрополис»")));
    }

}
