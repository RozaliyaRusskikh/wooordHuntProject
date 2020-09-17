package ru.wooordhunt.huntedWordTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.WelcomePage;
import ru.wooordhunt.pages.WordNotFoundPage;

public class NegativeHuntedWordTest extends Base {

    @Parameters({"word"})
    @Test
    public void findWordTest(String word) {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        WordNotFoundPage wordNotFoundPage = welcomePage.tryToFindWord(word);
        String expectedURL = wordNotFoundPage.getPageURL(word);
        String actualURL = wordNotFoundPage.getCurrentURL();

        Assert.assertEquals(actualURL, expectedURL);
    }
}
