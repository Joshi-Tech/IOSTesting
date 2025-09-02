package tests;

import pages.ActionSheetsPage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionSheetTests extends BaseTest {
    @Test
    public void actionSheetTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToActionSheetsPage();
        ActionSheetsPage actionSheetsPage = new ActionSheetsPage(driver);
        actionSheetsPage.clickOkCancel();
        actionSheetsPage.clickOkButton();
        Assert.assertEquals(actionSheetsPage.getHeader().getText(), "Action Sheets");
    }
}
