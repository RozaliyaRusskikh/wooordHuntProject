package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By emailLocator = By.id("LoginForm_email");
    private By passwordLocator = By.id("LoginForm_password");
    private By enterButtonLocator = By.className("green_button");
    private By errorMessageLocator = By.xpath("//*[@id=\"login-form\"]/div[1]/ul/li");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public SuccessfulEnter LogIn(String email, String password) {
        type(emailLocator, email);
        type(passwordLocator, password);
        click(enterButtonLocator);
        return new SuccessfulEnter(driver);
    }

    public void tryToLogIn(String email, String password) {
        type(emailLocator, email);
        type(passwordLocator, password);
        click(enterButtonLocator);
    }

    public String getErrorMessage() {
        return find(errorMessageLocator).getText();
    }

    public void waitForErrorMessage() {
        waitForVisibilityOf(errorMessageLocator, 10);
    }
}
