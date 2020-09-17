package ru.wooordhunt.huntedWordTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.wooordhunt.base.Base;
import ru.wooordhunt.pages.WelcomePage;
import ru.wooordhunt.pages.WordPage;

public class PositiveHuntedWordTest extends Base {

    @Parameters({"word"})
    @Test
    public void findWordTest(String word) {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.openPage();

        WordPage wordPage = welcomePage.findWord(word);
        String currentPage = welcomePage.getCurrentURL();
        String expectedPage = wordPage.getPageURL(word);
        Assert.assertEquals(currentPage, expectedPage);
    }
}
