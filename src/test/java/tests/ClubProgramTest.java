package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ClubProgramPage;

public class ClubProgramTest extends TestBase {

    ClubProgramPage clubProgramPage = new ClubProgramPage();

    @Test
    @DisplayName("Присоединение к клубной программе")
    public void registrationFormShouldOpen() {
        clubProgramPage.openClubProgramPage()
                .pushJoinButton()
                .checkOpenForm();
    }
}
