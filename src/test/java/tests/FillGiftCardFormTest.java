package tests;

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
    @DisplayName("Заполнение формы подарочной карты")
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
