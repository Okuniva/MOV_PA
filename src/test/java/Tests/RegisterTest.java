package Tests;

import Pages.MainPage;
import Pages.RegisterPage;
import TestFixtures.BaseTestFixture;
import org.junit.jupiter.api.Test;

public class RegisterTest extends BaseTestFixture {
    @Test
    public void Register() {
        new MainPage(driver)
                .isInitialized()
                .tap_account_icon()
                .tap_register_allert_button();

        new RegisterPage(driver)
                .enter_username("TestUserName")
                .tap_continue()
                .enter_phone("7037597596")
                .tap_continue()
                .enter_code("1234")
                .tap_continue();

        new MainPage(driver)
                .isInitialized();
    }
}
