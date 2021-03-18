import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.codeborne.selenide.Configuration;
import pages.LoginPage;
import pages.MoodPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    MoodPage moodPage;

    @BeforeMethod
    public void setUp() {
        Configuration.clickViaJs = false;
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        loginPage = new LoginPage();
        moodPage = new MoodPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        getWebDriver().quit();
    }
}
