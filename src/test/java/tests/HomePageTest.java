package tests;

import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void homePageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getHeader().click();
        Assert.assertEquals(homePage.getHeader().getText(), "UICatalog");
    }
}
