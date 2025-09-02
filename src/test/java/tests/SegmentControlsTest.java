package tests;

import pages.HomePage;
import pages.SegmentedControlsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SegmentControlsTest extends BaseTest {

    @Test
    public void segmentControlsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.gotToSegmentedControlsPage().click();
        SegmentedControlsPage segmentedControlsPage = new SegmentedControlsPage(driver);
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Tools"), "1");
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Check"), "1");
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Search"), "1");
    }
}
