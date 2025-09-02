package tests;

import pages.DatePickerPage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    @Test
    public void datePickerTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToDatePickerPage();
        DatePickerPage datePickerPage = new DatePickerPage(driver);
        Assert.assertEquals(datePickerPage.getTodayDate().getText(),
                datePickerPage.getTodayDate().getText());
    }
}
