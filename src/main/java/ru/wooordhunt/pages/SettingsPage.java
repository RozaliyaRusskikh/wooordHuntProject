package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {

    private WebElement radioButtonUS;
    private WebElement radioButtonUK;

    public SettingsPage(WebDriver driver) {
        super(driver);

        By radioButtonUSLocator = By.xpath("//*[@id=\"ex_lng\"]/label[1]");
        radioButtonUS = find(radioButtonUSLocator);

        By radioButtonUKLocator = By.xpath("//*[@id=\"ex_lng\"]/label[2]");
        radioButtonUK = find(radioButtonUKLocator);
    }

    public void selectRadioButton() {
        if (radioButtonUS.isDisplayed()) {
            radioButtonUK.click();
        } else {
            radioButtonUS.click();
        }
    }

    public boolean areOneRadioButtonSelected() {
        return radioButtonUS.isDisplayed() || radioButtonUK.isDisplayed();
    }
}
