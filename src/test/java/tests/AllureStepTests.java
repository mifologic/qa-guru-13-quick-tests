package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AllureStepTests extends TestBase {

    String city = "Нижний Новгород";

    @Test
    @AllureId("11656")
    @DisplayName("Изменение города")
    @Owner("allure8")
    @Feature("Тестирование сайта sportmaster.ru")
    public void changeCity() {
        step("Открыть главную страницу", () -> open("/"));
        step("Открыть форму выбора города", () -> $("[data-selenium=\"cityButton\"]").click());
        step("Ввести название города", () -> $("[data-selenium=\"top-cities-list\"]").$(byText(city)).click());
        sleep(2000);
        step("Проверить, что город изменился", () -> $("[data-selenium=\"cityButton\"]")
                .should(Condition.text(city))
                .should(Condition.visible));
    }
}
