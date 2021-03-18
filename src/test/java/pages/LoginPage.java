package pages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
    public static final String PASSWORD_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
    public static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

    public void openPage() {
        open("https://moodpanda.com/Login/");
    }

    public void login(String userName, String password) {
        $(EMAIL_INPUT).setValue(userName);
        $(PASSWORD_INPUT).setValue(password);
        $(LOGIN_BUTTON).click();
        $(LOGIN_BUTTON).shouldNotBe(Condition.visible);


    }
}
