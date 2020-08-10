package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {


    public RegisterPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public RegisterPage enter_username(String username) {
        sleep(1500);
        enterByClassAndText("XCUIElementTypeTextField", "username", username);
        sleep(500);
        driver.findElement(MobileBy.name("Done")).click();
        ts.takeScreenshot(driver, "enter_username_" + username);

        return this;
    }

    public RegisterPage tap_continue() {
        By continue_button = MobileBy.name("Continue");
        tap(continue_button);

        return this;
    }

    public RegisterPage enter_phone(String phone) {
        sleep(1500);
        enterByClassAndText("XCUIElementTypeTextField", "Your Phone", phone);
        sleep(500);
        driver.findElement(MobileBy.name("Done")).click();
        ts.takeScreenshot(driver, "enter_phone_" + phone);

        return this;
    }

    public RegisterPage enter_code(String code) {
        sleep(1500);
        enterByClassAndText("XCUIElementTypeTextField", "Type Code Here", code);
        sleep(500);
        driver.findElement(MobileBy.name("Done")).click();
        ts.takeScreenshot(driver, "enter_code" + code);

        return this;
    }
}
