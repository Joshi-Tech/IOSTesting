package tests;

import pages.HomePage;
import pages.PickerViewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PickerViewTest extends BaseTest {

    @Test
    public void pickerViewTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToPickerViewPage().click();
        PickerViewPage pickerViewPage = new PickerViewPage(driver);
        pickerViewPage.setColor("Red", "195");
        Assert.assertEquals(pickerViewPage.getColorValue("Red"), "195");
        pickerViewPage.setColor("Green", "250");
        Assert.assertEquals(pickerViewPage.getColorValue("Green"), "250");
        pickerViewPage.setColor("Blue", "115");
        Assert.assertEquals(pickerViewPage.getColorValue("Blue"), "115");
    }
}
