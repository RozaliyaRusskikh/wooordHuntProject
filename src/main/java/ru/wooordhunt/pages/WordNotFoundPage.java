package ru.wooordhunt.pages;

import org.openqa.selenium.WebDriver;

public class WordNotFoundPage extends BasePage {

    public WordNotFoundPage(WebDriver driver) {
        super(driver);
    }

    public String getPageURL(String word) {
        if (word.length() < 10) {
            return "https://wooordhunt.ru/ooops/wordnotfound?word=" + word;
        } else {
            return "https://wooordhunt.ru/ooops/wordnotfound?abra&word=" + word;
        }
    }
}
