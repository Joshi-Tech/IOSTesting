package tests;/*
package tests;

import hook.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class IOSAppTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void setUpPage() {
        homePage = new HomePage(driver); // driver is initialized by BaseTest now
    }

    @Test
    public void actionSheetTest() {
        homePage.goToActionSheetsPage();
        ActionSheetsPage actionSheetsPage = new ActionSheetsPage(driver);
        actionSheetsPage.clickOkCancel();
        actionSheetsPage.clickOkButton();
        Assert.assertEquals(actionSheetsPage.getHeader().getText(), "Action Sheets");
    }

    @Test
    public void buttonPage() {
        homePage.goToButtonsPage();
        Assert.assertEquals(homePage.getElementByChain("Buttons").getText(), "Buttons");
    }

    @Test
    public void homePageTest() {
        homePage.getHeader().click();
        Assert.assertEquals(homePage.getHeader().getText(), "UICatalog");

    }

    @Test
    public void datePickerTest() {
        homePage.goToDatePickerPage();
        DatePickerPage datePickerPage = new DatePickerPage(driver);
        Assert.assertEquals(datePickerPage.getTodayDate().getText(),
                datePickerPage.getTodayDate().getText());
    }

    @Test
    public void pickerViewTest() {
        homePage.goToPickerViewPage().click();
        PickerViewPage pickerViewPage = new PickerViewPage(driver);
        pickerViewPage.setColor("Red", "195");
        Assert.assertEquals(pickerViewPage.getColorValue("Red"), "195");
        pickerViewPage.setColor("Green", "250");
        Assert.assertEquals(pickerViewPage.getColorValue("Green"), "250");
        pickerViewPage.setColor("Blue", "115");
        Assert.assertEquals(pickerViewPage.getColorValue("Blue"), "115");
    }

    @Test
    public void alertViewsTest() {
        homePage.goToAlertViewPage().click();
        AlertViewPage alertViewPage = new AlertViewPage(driver);
        Assert.assertEquals(alertViewPage.getSimpleHeader("Simple"), "A Short Title Is Best");
        Assert.assertEquals(alertViewPage.getSimpleMainMessage(), "A message should be a short, complete sentence.");
        alertViewPage.clickAlertOption("Text Entry");
        Assert.assertEquals(alertViewPage.getSimpleHeader("Simple"), "A Short Title Is Best");
    }

    @Test
    public void segmentControlsTest() {
        homePage.gotToSegmentedControlsPage().click();
        SegmentedControlsPage segmentedControlsPage = new SegmentedControlsPage(driver);
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Tools"), "1");
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Check"), "1");
        Assert.assertEquals(segmentedControlsPage.getTintedButtonTypeClicked("Search"), "1");
    }

    @Test
    public void progressViewsTest() {
        homePage.goToProgressViewsPage().click();
        ProgressViewPage progressViewPage = new ProgressViewPage(driver);
        Assert.assertTrue(progressViewPage.defaultProgressBar(0));
        Assert.assertTrue(progressViewPage.defaultProgressBar(1));
        Assert.assertTrue(progressViewPage.defaultProgressBar(2));
    }

    @Test
    public void steppersPageTest() {
        homePage.goToSteppersPage().click();
        SteppersPage steppersPage = new SteppersPage(driver);
        int count = steppersPage.getSteppersCount("Increment", "Decrement", 0, 6, 2);
        Assert.assertEquals(count, 4);
    }

    @Test
    public void slidersPageTest(){
        homePage.goToSlidersPage().click();
        SlidersPage slidersPage = new SlidersPage(driver);
        slidersPage.moveDefaultSliderByDragging();
       // slidersPage.moveDefaultSliderToTheRight();
    }
}


*/
