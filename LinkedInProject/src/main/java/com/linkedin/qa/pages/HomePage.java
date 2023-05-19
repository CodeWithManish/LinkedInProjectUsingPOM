package com.linkedin.qa.pages;

import com.linkedin.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[@title='Home']")
    WebElement homeBtn;

    @FindBy(xpath = "//span[@title='My Network']")
    WebElement myNetworkBtn;

    @FindBy(xpath = "//span[@title='Jobs']")
    WebElement jobsBtn;

    @FindBy(xpath = "//span[@title='Messaging']")
    WebElement msgBtn;

    @FindBy(xpath = "//span[@title='Notifications']")
    WebElement notificationBtn;

    @FindBy(xpath = "//div[@class='global-nav__me artdeco-dropdown artdeco-dropdown--placement-bottom artdeco-dropdown--justification-left ember-view']")
    WebElement profileBtn;

    // Initializing the Page Objects:
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public boolean verifyHomePageLink() {
        return homeBtn.isDisplayed();
    }

    public HomePage clickMyNetworkLink() {
        try {
            myNetworkBtn.click();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new HomePage();
    }

    public HomePage clickJobsLink() {
        try {
            jobsBtn.click();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new HomePage();
    }

    public HomePage clickMessagingLink() {
        try {
            msgBtn.click();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new HomePage();
    }

    public HomePage clickOnNotificationsLink() {
        try {
            notificationBtn.click();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new HomePage();
    }

    public HomePage clickProfileLink() {
        try {
            profileBtn.click();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return new HomePage();
    }

}
