package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchGoodsTest extends TestBase {

    MainPage mainPage = new MainPage();
    String searchWord = "палатки";

    @Test
    @DisplayName("Поиск заданной категории товара в каталоге")
    public void goodsCategoryShouldBeFound() {
        mainPage.openMainPage()
                .typeSearchWord(searchWord)
                .checkGoodsFound(searchWord);
    }
}
