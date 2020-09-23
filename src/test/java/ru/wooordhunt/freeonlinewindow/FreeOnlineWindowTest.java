package ru.wooordhunt.freeonlinewindow;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.FreeOnlineWindowPage;
import ru.wooordhunt.pages.WelcomePage;

public class FreeOnlineWindowTest extends Base {
    @Test
    public void freeOnlineWindowTest() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        welcomePage.openFreeOnlinePage();

        FreeOnlineWindowPage freeOnlineWindowPage = welcomePage.switchToNewWindow();
        String pageSource = freeOnlineWindowPage.getCurrentPageSource();
        Assert.assertTrue(pageSource.contains("Адаптированная литература на английском и книги с параллельным переводом (онлайн)"));
    }
}
