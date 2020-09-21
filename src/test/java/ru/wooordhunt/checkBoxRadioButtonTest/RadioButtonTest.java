package ru.wooordhunt.checkBoxRadioButtonTest;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.*;

public class RadioButtonTest extends Base {

    @Test
    public void radioButtonsTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();
        LoginPage loginPage = welcomePage.clickEnterLink();
        SuccessfulEnter successfulEnter = loginPage.LogIn("rrrusskikh@gmail.com", "520203");
        ProfilePage profilePage = successfulEnter.clickProfileLink();
        SettingsPage settingsPage = profilePage.clickSettingsLink();
        settingsPage.selectRadioButton();
        Assert.assertTrue(settingsPage.areOneRadioButtonSelected());
    }
}
