package tests;

import pages.AlertViewPage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertViewTest extends BaseTest {

    @Test
    public void alertViewsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToAlertViewPage().click();
        AlertViewPage alertViewPage = new AlertViewPage(driver);
        Assert.assertEquals(alertViewPage.getSimpleHeader("Simple"), "A Short Title Is Best");
        Assert.assertEquals(alertViewPage.getSimpleMainMessage(), "A message should be a short, complete sentence.");
        alertViewPage.clickAlertOption("Text Entry");
        Assert.assertEquals(alertViewPage.getSimpleHeader("Simple"), "A Short Title Is Best");
    }
}
