package com.linkedin.qa.pages;

import com.linkedin.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//div[@class='global-nav__me artdeco-dropdown artdeco-dropdown--placement-bottom artdeco-dropdown--justification-left ember-view']")
    WebElement profileBtn;

    @FindBy(xpath = "(//div[@id='ember16'])[1]")
    WebElement viewProfileBtn;

    @FindBy(xpath = "//button[@aria-label='Edit profile background']")
    WebElement profileBackgroundLink;

    @FindBy(xpath = "//button[@aria-label='Edit intro']")
    WebElement editIntroLink;


    // Initializing the page objects - constructor of HomePage
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void Profile() {
        profileBtn.click();
        viewProfileBtn.click();
        profileBackgroundLink.click();
        editIntroLink.click();
    }

    public ProfilePage viewProfile() {
        profileBtn.click();
        viewProfileBtn.click();
        return viewProfile();
    }

    public ProfilePage editProfile() {
        profileBtn.click();
        viewProfileBtn.click();
        editIntroLink.click();
        return editProfile();
    }

    public ProfilePage profileBackground() {
        profileBtn.click();
        viewProfileBtn.click();
        profileBackgroundLink.click();
        return profileBackground();
    }
}
