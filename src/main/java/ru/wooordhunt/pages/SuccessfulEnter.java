package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulEnter extends BasePage {

    private String link = "https://wooordhunt.ru/site/page?view=just_come";
    private By notice = By.xpath("//div[@id='content']/div[@class='info_block']/p[1]");

    public String getPageUrl() {
        return link;
    }

    public SuccessfulEnter(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        return find(notice).getText();
    }
}
