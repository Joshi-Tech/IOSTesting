package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SteppersPage;

public class SteppersPageTest extends BaseTest {

    @Test
    public void steppersPageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToSteppersPage().click();
        SteppersPage steppersPage = new SteppersPage(driver);
        int count = steppersPage.getSteppersCount("Increment", "Decrement", 0, 6, 2);
        Assert.assertEquals(count, 4);
    }
}
