import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest{

    String email = "moe_milo93@mail.ru";
    String password = "123456789";

    @Test
    public void updateMood() {
        loginPage.openPage();
        loginPage.login(email, password);
        moodPage.clickUpdate();
        moodPage.updateMood(8, "0");
        System.out.println();
    }
}
