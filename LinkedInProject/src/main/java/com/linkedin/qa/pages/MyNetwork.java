package com.linkedin.qa.pages;

import com.linkedin.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyNetwork extends TestBase {
    @FindBy(xpath = "//span[text()='My Network']")
    WebElement myNetworkBtn;

    @FindBy(xpath = "//div[text()='Connections']")
    WebElement connectionLink;

    @FindBy(xpath = "//div[text()='Contacts']")
    WebElement contactLink;

    @FindBy(xpath = "//div[text()='Following & followers']")
    WebElement followingAndFollowersLink;

    @FindBy(xpath = "//div[text()='Groups']")
    WebElement groupsLink;

    @FindBy(xpath = "//div[text()='Events']")
    WebElement eventsLink;

    public MyNetwork checkConnectionLink() {
        myNetworkBtn.click();
        connectionLink.click();
        return checkConnectionLink();
    }

    public MyNetwork checkContactsLink() {
        myNetworkBtn.click();
        contactLink.click();
        return checkConnectionLink();
    }

    public MyNetwork checkFollowingAndFollowersLink() {
        myNetworkBtn.click();
        followingAndFollowersLink.click();
        return checkFollowingAndFollowersLink();
    }

    public MyNetwork checkGroupsLink() {
        myNetworkBtn.click();
        groupsLink.click();
        return checkGroupsLink();
    }

    public MyNetwork checkEventsLink() {
        myNetworkBtn.click();
        eventsLink.click();
        return checkEventsLink();
    }


}
