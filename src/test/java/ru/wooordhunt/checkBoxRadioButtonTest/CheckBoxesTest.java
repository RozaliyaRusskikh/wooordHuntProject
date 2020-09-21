package ru.wooordhunt.checkBoxTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.*;

public class CheckBoxesTest extends Base {

    @Test
    public void checkBoxesTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.clickEnterLink();

        SuccessfulEnter successfulEnter = loginPage.LogIn("rrrusskikh@gmail.com", "520203");

        ProfilePage profilePage = successfulEnter.clickProfileLink();

        ReminderPage reminderPage = profilePage.clickReminderLink();
        reminderPage.selectAllCheckBoxes();

        Assert.assertTrue(reminderPage.areAllCheckBoxesSelected());
    }
}
