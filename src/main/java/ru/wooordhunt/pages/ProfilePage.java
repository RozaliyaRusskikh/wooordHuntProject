package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {
    private By reminderLink = By.linkText("Напоминания");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ReminderPage clickReminderLink () {
        click(reminderLink);
        return new ReminderPage(driver);
    }

}
