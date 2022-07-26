package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GiftCardPage;

public class FillGiftCardFormTest extends TestBase {

    GiftCardPage giftCardPage = new GiftCardPage();

    String recipientPhone = "9111111111";
    String recipientEmail = "recipient@mail.ru";
    String senderEmail = "sender@mail.ru";
    String greeting = "Dear friend";
    String greetingsText = "Have a nice day";
    String signature = "Sincerely yours";


    @Test
    @AllureId("11671")
    @DisplayName("Оформление подарочной карты")
    @Owner("allure8")
    @Feature("Тестирование сайта sportmaster.ru")
    public void userGoToPaymentPageAfterFillForm() {
        giftCardPage.openPage()
                .addRecipientPhoneNumber(recipientPhone)
                .addRecipientEmail(recipientEmail)
                .addSenderEmail(senderEmail)
                .addGreeting(greeting)
                .addGreetingsText(greetingsText)
                .addSignature(signature)
                .confirmRules()
                .pushGoToPaymentButton()
                .checkPaymentPage();
    }
}
