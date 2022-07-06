package proj.stepsCuc;

import proj.Pages.MainPage;

import io.cucumber.java.ru.И;

public class MainPageStepsCuc {
    MainPage mainPage = new MainPage();

    @И("Открываем командировки")
    public void clickExpencesDropdown() {
        mainPage.expencesDropDownClick();
        mainPage.tripsButtonClick();
    }
}
