package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClubProgramPage {

    @Step("Открыть страницу клубной программы")
    public ClubProgramPage openClubProgramPage() {
        open("/clubpro/rules/");
        return this;
    }

    @Step("Нажать кнопку присоединения")
    public ClubProgramPage pushJoinButton() {
        $(".main_banner__content > a").click();
        return this;
    }

    @Step("Проверить, что открылась форма входа или регистрации")
    public void checkOpenForm() {
        $("[data-selenium=\"auth-title\"]")
                .should(Condition.text(" Вход или регистрация "))
                .should(Condition.visible);
    }
}
