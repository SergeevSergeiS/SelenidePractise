package ru.internet.sergeevss90.answers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class QuestionThreeTest {
    SelenideElement bi = $("#column-b");

    @BeforeAll
    static void prepare() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void dragAndDropTest() {
        open("");
        //actions().dragAndDrop($("#column-a"),$("#column-b")).perform(); //still not working :(
        $("#column-a").dragAndDropTo(bi);
        bi.shouldHave(text("A"));
    }
}

