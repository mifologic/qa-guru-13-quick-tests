package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
    static String selenoidURL;

    @BeforeAll
    static void setUp() {

        String login = config.login();
        String password = config.password();
        String browserName = config.browserName();
        String browserVersion = config.browserVersion();
        String baseUrl = config.baseUrl();
        String browserSize = config.browserSize();
        selenoidURL = System.getProperty("selenoidURL");

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.baseUrl = baseUrl;
        Configuration.browserSize = browserSize;
        if(selenoidURL != null) {
            Configuration.remote = "https://" + login + ":" + password + "@" + selenoidURL;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", browserName);
            capabilities.setCapability("browserVersion", browserVersion);
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Test screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo(selenoidURL);
        closeWebDriver();
    }


}
