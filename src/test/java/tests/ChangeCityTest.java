package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ChangeCityTest extends TestBase {

    String city = "Нижний Новгород";

    @Test
    @DisplayName("Изменение города")
    public void userCanChangeCity() {

        step("Открыть главную страницу", () -> open("/"));
        step("Открыть форму выбора города", () -> $("[data-selenium=\"cityButton\"]").click());
        step("Ввести название города", () -> $("[data-selenium=\"top-cities-list\"]").$(byText(city)).click());
        sleep(2000);
        step("Проверить, что город изменился", () -> $("[data-selenium=\"cityButton\"]")
                .should(Condition.text(city))
                .should(Condition.visible));
    }
}
