package ru.wooordhunt.loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.LoginPage;
import ru.wooordhunt.pages.SuccessfulEnter;
import ru.wooordhunt.pages.WelcomePage;

public class PositiveLogInTest extends Base {

    @Test
    public void logInTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();
        LoginPage loginPage = welcomePage.clickEnterLink();
        SuccessfulEnter successfulEnter = loginPage.LogIn("rrrusskikh@gmail.com", "520203");

        Assert.assertEquals(successfulEnter.getCurrentURL(), successfulEnter.getPageUrl());

        String expectedMessage = "Вы успешно вошли на сайт как зарегистрированный пользователь, " +
                "и теперь вам доступны все функции сайта.";
        Assert.assertEquals(successfulEnter.getSuccessMessage(), expectedMessage);
    }
}
