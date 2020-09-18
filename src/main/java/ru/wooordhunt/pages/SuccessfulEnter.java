package ru.wooordhunt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulEnter extends BasePage {

    private String link = "https://wooordhunt.ru/site/page?view=just_come";
    private By notice = By.xpath("//div[@id='content']/div[@class='info_block']/p[1]");
    private By profileLink = By.linkText("Личный кабинет");


    public SuccessfulEnter(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return link;
    }

    public String getSuccessMessage() {
        return find(notice).getText();
    }

    public ProfilePage clickProfileLink() {
        click(profileLink);
        return new ProfilePage(driver);
    }

}
