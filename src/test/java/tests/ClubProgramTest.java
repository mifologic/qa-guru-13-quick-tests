package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ClubProgramPage;

public class ClubProgramTest extends TestBase {

    ClubProgramPage clubProgramPage = new ClubProgramPage();

    @Test
    @AllureId("11673")
    @DisplayName("Присоединение к клубной программе")
    @Owner("allure8")
    @Feature("Тестирование сайта sportmaster.ru")
    public void registrationFormShouldOpen() {
        clubProgramPage.openClubProgramPage()
                .pushJoinButton()
                .checkOpenForm();
    }
}
