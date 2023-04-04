import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {
    @Test
    public void test1() {
        open("http://localhost:9999/");
        $("span[data-test-id=name] input").setValue("Иванов Иван");
        $("span[data-test-id=phone] input").setValue("+79138565456");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $(".paragraph_theme_alfa-on-white").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    public void test2() {
        open("http://localhost:9999/");
        $("span[data-test-id=name] input").setValue("Христорождественская Апполинария");
        $("span[data-test-id=phone] input").setValue("+79135445456");
        $("[data-test-id=agreement]").click();
        $("[type=button]").click();
        $(".paragraph_theme_alfa-on-white").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}

