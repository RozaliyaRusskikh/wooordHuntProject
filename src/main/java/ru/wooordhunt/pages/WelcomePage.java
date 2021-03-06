package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
    private String startLink = "https://wooordhunt.ru/";
    private By enterLink = By.linkText("Вход");
    private By huntedWorldFieldLocator = By.id("hunted_word");
    private By submitButtonLocator = By.id("hunted_word_submit");
    private By freeOnlineImage = By.xpath("//*[@id=\"menu_a_block\"]/a");

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        openURL(startLink);
    }

    public LoginPage clickEnterLink() {
        click(enterLink);
        return new LoginPage(driver);
    }

    public WordPage findWord(String word) {
        type(huntedWorldFieldLocator, word);
        click(submitButtonLocator);
        return new WordPage(driver);
    }

    public WordNotFoundPage tryToFindWord(String word) {
        type(huntedWorldFieldLocator, word);
        click(submitButtonLocator);
        return new WordNotFoundPage(driver);
    }

    public void openFreeOnlinePage() {
        click(freeOnlineImage);
    }

    public FreeOnlineWindowPage switchToNewWindow() {
        switchToNewWindowWithTitle("Адаптированная литература на английском и книги с параллельным переводом (онлайн)");
        return new FreeOnlineWindowPage(driver);
    }
}
