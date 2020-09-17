package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WordPage extends BasePage {

    public WordPage(WebDriver driver) {
        super(driver);
    }

    public String getPageURL(String word) {
        return "https://wooordhunt.ru/word/" + word;
    }
}
