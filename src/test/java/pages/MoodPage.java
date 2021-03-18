package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MoodPage {
    public static final String UPDATE_BUTTON = "#LinkUpdate";
    public static final String SLIDER = ".ui-slider-handle";
    public static final String DESCRIPTION = "#TextBoxUpdateMoodTag";
    public static final String UPDATE_BUTTON_MODAL = ".ButtonUpdate";
    public static final String TO_DIARY_BUTTON = ".ButtonMyDiary";

    public void clickUpdate() {
        $(UPDATE_BUTTON).click();
    }

    public void updateMood(int rating, String description) {
        setMood(rating);
        $(DESCRIPTION).sendKeys(description);
        $(UPDATE_BUTTON_MODAL).click();
        $(TO_DIARY_BUTTON).click();
    }

    public void setMood(int raiting) {
        int defaultMood = 5;
        $(SLIDER).click();
        Keys direction;
        if (raiting > defaultMood) {
            direction = Keys.ARROW_RIGHT;
        } else {
            direction = Keys.ARROW_LEFT;
        }
        for (int i = 0; i < Math.abs(raiting - defaultMood); i++) {
            $(SLIDER).sendKeys(direction);
        }
    }

}
