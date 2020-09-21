package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderPage extends BasePage {
    List<WebElement> list;

    public ReminderPage(WebDriver driver) {
        super(driver);
        By checkbox = By.xpath("//input[@type='checkbox']");
        list = findAll(checkbox);
    }

    public void selectAllCheckBoxes() {
        for (WebElement element : list) {
            if (!element.isSelected()) {
                element.click();
            }
        }
    }

    public boolean areAllCheckBoxesSelected() {
        for (WebElement element : list) {
            if (!element.isSelected()) {
                return false;
            }
        }
        return true;
    }
}
