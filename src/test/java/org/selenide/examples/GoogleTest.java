package org.selenide.examples;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        Configuration.browser = "chrome";
        open("http://google.com/ncr");
        $(By.name("q")).setValue("Selenide").pressEnter();

        //$$(By.cssSelector("#ires li.g")).shouldHave(size(10));

        $(By.cssSelector("#rso > div")).shouldHave(Condition.text("concise UI tests in Java"));
    }
}
