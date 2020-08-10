package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    By account_icon = MobileBy.AccessibilityId("user");
    By login_allert_button = MobileBy.name("Login");
    By register_allert_button = MobileBy.name("Register");
    By new_ticket = MobileBy.name("newTicketon");
    By enter_allert_button = MobileBy.name("Enter");
    By feed_bottom = MobileBy.AccessibilityId("feedBottom");


    public MainPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public MainPage isInitialized() {
        waitPresence(feed_bottom);

        return this;
    }

    public MainPage tap_new_ticket() {
        tap(new_ticket);
        ts.takeScreenshot(driver, "tap_new_ticket");

        return this;
    }

    public MainPage tap_enter() {
        tap(enter_allert_button);
        ts.takeScreenshot(driver, "tap_enter");
        sleep(3000);
        ts.takeScreenshot(driver, "buy_ticket_result");

        return this;
    }

    public MainPage tap_account_icon() {
        tap(account_icon);
        ts.takeScreenshot(driver, "tap_account_icon");

        return this;
    }

    public MainPage tap_login_allert_button() {
        tap(login_allert_button);
        ts.takeScreenshot(driver, "tap_login_allert_button");

        return this;
    }

    public MainPage tap_register_allert_button() {
        tap(register_allert_button);
        ts.takeScreenshot(driver, "tap_register_allert_button");

        return this;
    }
}
