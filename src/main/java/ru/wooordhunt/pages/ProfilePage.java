package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {
    private By reminderLink = By.linkText("Напоминания");
    private By settingsLocator = By.linkText("Настройки");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ReminderPage clickReminderLink() {
        click(reminderLink);
        return new ReminderPage(driver);
    }

    public SettingsPage clickSettingsLink() {
        click(settingsLocator);
        return new SettingsPage(driver);
    }
}
