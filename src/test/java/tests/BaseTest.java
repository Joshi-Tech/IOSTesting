package tests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static WebDriver driver;

    public WebDriver initializeDriver() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 15 Pro");
        options.setPlatformVersion("17.5");

        // Allow overriding the app path via -Dapp.path
        options.setApp(System.getProperty("app.path", "/Users/qa/Documents/UICatalog.app"));
        options.setPlatformName("iOS");

        // Allow overriding the base path via -Dserver.path
        String basePath = System.getProperty("server.path", "");
        String serverUrl = "http://127.0.0.1:4723" + basePath;

        return driver = new IOSDriver(new URL(serverUrl), options);
    }
}
