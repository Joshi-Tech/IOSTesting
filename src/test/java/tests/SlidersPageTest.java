package tests;

import pages.HomePage;
import pages.SlidersPage;
import org.testng.annotations.Test;

public class SlidersPageTest extends BaseTest {

    @Test
    public void slidersPageTest(){
        HomePage homePage = new HomePage(driver);
        homePage.goToSlidersPage().click();
        SlidersPage slidersPage = new SlidersPage(driver);
        slidersPage.moveDefaultSliderByDragging();
        // slidersPage.moveDefaultSliderToTheRight();
    }
}
