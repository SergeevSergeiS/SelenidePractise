package ru.internet.sergeevss90.answers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class QuestionTwoTest {
    SelenideElement body = $(".markdown-body");

    @BeforeAll
    static void prepare() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://github.com/selenide/selenide";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void testSelenidePage() {
        open("");
        $("#wiki-tab").click();
        body.shouldHave(text("Soft assertions"));
        body.$(byText("Soft assertions")).click();
        body.$("#user-content-3-using-junit5-extend-test-class")
                .parent()
                .shouldHave(text("Using JUnit5 extend test class"));
    }
}
