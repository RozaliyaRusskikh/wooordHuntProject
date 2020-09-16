package ru.wooordhunt.loginTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.LoginPage;
import ru.wooordhunt.pages.WelcomePage;

public class NegativeLogInTests extends Base {
    @Parameters({"email", "password"})
    @Test
    public void negativeLoginTest(String email, String password) {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        LoginPage loginPage = welcomePage.clickEnterLink();
        loginPage.tryToLogIn(email, password);
        loginPage.waitForErrorMessage();
        String expectedMessage = "Неверный email или пароль.";
        String message = loginPage.getErrorMessage();
        Assert.assertEquals(message, expectedMessage);
    }
}
