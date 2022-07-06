package proj.stepsCuc;
import io.cucumber.java.ru.И;
import proj.Pages.LoginPage;

public class LoginPageStepsCuc {
    LoginPage loginPage = new LoginPage();

    @И("^Заполняем поля 'Логин'(.+) и 'Пароль' (.+)$")
    public void setLoginAndPassword (String login, String password) {
        loginPage.enterLoginAndPassword(login, password);
    }

    @И("Нажимаем 'Войти'")
    public void clickSubmit() {
        loginPage.clickSubmit();
    }
}


