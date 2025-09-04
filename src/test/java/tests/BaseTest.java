package tests;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static IOSDriver driver;

    @BeforeMethod
    public IOSDriver setUp() throws MalformedURLException {
        // Read from system properties, fallback to defaults
        String deviceName = System.getProperty("deviceName", "iPhone 16 Pro");
        String platformVersion = System.getProperty("platformVersion", "18.6");
        String appPath = System.getProperty("appPath",
                "/Users/lkjoshi/Library/Developer/Xcode/DerivedData/UICatalog-gwynisoydgnpybcuqfqtlmtnfhrg/Build/Products/Debug-iphonesimulator/UICatalog.app");
        String serverPath = System.getProperty("server.path", "http://127.0.0.1:4723/wd/hub");

        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setPlatformVersion(platformVersion)
                .setDeviceName(deviceName)
                .setAutomationName("XCUITest")
                .setApp(appPath);

        return driver = new IOSDriver(new URL(serverPath), options);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
