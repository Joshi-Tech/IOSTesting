package tests;

import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonPageTest extends BaseTest {
    @Test
    public void buttonPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToButtonsPage();
        Assert.assertEquals(homePage.getElementByChain("Buttons").getText(), "Buttons");
    }
}
