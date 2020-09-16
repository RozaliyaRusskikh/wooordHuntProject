package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
    private String startLink = "https://wooordhunt.ru/";
    private By enterLink = By.linkText("Вход");

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
}
