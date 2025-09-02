package tests;

import pages.HomePage;
import pages.ProgressViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressViewsTest extends BaseTest {

    @Test
    public void progressViewsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToProgressViewsPage().click();
        ProgressViewPage progressViewPage = new ProgressViewPage(driver);
        Assert.assertTrue(progressViewPage.defaultProgressBar(0));
        Assert.assertTrue(progressViewPage.defaultProgressBar(1));
        Assert.assertTrue(progressViewPage.defaultProgressBar(2));
    }
}
