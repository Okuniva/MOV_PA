package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import TestFixtures.BaseTestFixture;
import org.junit.jupiter.api.Test;

public class BuyTicketTest extends BaseTestFixture {
    @Test
    public void BuyTicket() {
        new MainPage(driver)
                .isInitialized()
                .tap_new_ticket()
                .tap_login_allert_button();

        new LoginPage(driver)
                .enter_phone("8113970370")
                .enter_password("1234")
                .tap_login();

        new MainPage(driver)
                .isInitialized()
                .tap_new_ticket()
                .tap_enter();
    }
}
