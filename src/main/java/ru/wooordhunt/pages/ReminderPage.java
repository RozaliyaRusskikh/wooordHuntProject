package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderPage extends BasePage {
    private By checkbox = By.xpath("//input[@type='checkbox']");

    public ReminderPage(WebDriver driver) {
        super(driver);
    }

    public void selectAllCheckBoxes() {
        List<WebElement> list = findAll(checkbox);
        for (WebElement element : list) {
            if (!element.isSelected()) {
                element.click();
            }
        }
    }

    public boolean areAllCheckBoxesSelected() {
        List<WebElement> list = findAll(checkbox);
        for (WebElement element : list) {
            if (!element.isSelected()) {
                return false;
            }
        }
        return true;
    }
}
