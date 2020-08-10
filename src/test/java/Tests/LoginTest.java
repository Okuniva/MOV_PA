package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import TestFixtures.BaseTestFixture;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestFixture {
    @Test
    public void Login() {
        new MainPage(driver)
                .isInitialized()
                .tap_account_icon()
                .tap_login_allert_button();

        new LoginPage(driver)
                .enter_phone("8113970370")
                .enter_password("1234")
                .tap_login();

        new MainPage(driver)
                .isInitialized();
    }
}
