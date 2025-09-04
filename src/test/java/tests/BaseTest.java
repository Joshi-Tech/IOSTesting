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
        // ✅ Read app path from system property (set in GitHub Actions)
        // If not set, fall back to your local DerivedData path
        String appPath = System.getProperty(
                "app.path",
                "/Users/lkjoshi/Library/Developer/Xcode/DerivedData/UICatalog-gwynisoydgnpybcuqfqtlmtnfhrg/Build/Products/Debug-iphonesimulator/UICatalog.app"
        );

        System.out.println("🚀 Using app from: " + appPath);

        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setPlatformVersion("18.6")
                .setDeviceName("iPhone 16 Pro")
                .setAutomationName("XCUITest")
                .setApp(appPath);

        return driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}






/*
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
        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setPlatformVersion("18.6")
                .setDeviceName("iPhone 16 Pro")
                .setAutomationName("XCUITest")
                .setApp("/Users/lkjoshi/Library/Developer/Xcode/DerivedData/UICatalog-gwynisoydgnpybcuqfqtlmtnfhrg/Build/Products/Debug-iphonesimulator/UICatalog.app");

     return    driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
*/
