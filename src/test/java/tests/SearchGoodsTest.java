package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchGoodsTest extends TestBase {

    MainPage mainPage = new MainPage();
    String searchWord = "палатки";

    @Test
    @AllureId("11670")
    @DisplayName("Поиск товара в каталоге")
    @Owner("allure8")
    @Feature("Тестирование сайта sportmaster.ru")
    public void goodsCategoryShouldBeFound() {
        mainPage.openMainPage()
                .typeSearchWord(searchWord)
                .checkGoodsFound(searchWord);
    }
}
