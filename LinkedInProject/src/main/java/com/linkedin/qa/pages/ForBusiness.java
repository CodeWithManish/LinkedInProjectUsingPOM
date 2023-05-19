package com.linkedin.qa.pages;

import com.linkedin.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForBusiness extends TestBase {

    @FindBy(xpath = "//span[@title='For Business']")
    WebElement forBusinessLink;

    @FindBy(xpath = "//span[@title='Learning']")
    WebElement learningLink;

    @FindBy(xpath = "//span[text()='Insights']")
    WebElement insightsLink;

    @FindBy(xpath = "//span[text()='Post a job']")
    WebElement postAJobLink;

    @FindBy(xpath = "//span[text()='Advertise']")
    WebElement advertiseLink;

    @FindBy(xpath = "//span[@title='Find Leads']")
    WebElement findLeadsLink;

    @FindBy(xpath = "//span[@title='Groups']")
    WebElement groupLink;

    @FindBy(xpath = "//span[@title='Services Marketplace']")
    WebElement serviceMarketPlace;


    public ForBusiness checkLearningLink() {
        forBusinessLink.click();
        learningLink.click();
        return checkLearningLink();
    }

    public ForBusiness checkInsightsLink() {
        forBusinessLink.click();
        insightsLink.click();
        return checkInsightsLink();
    }

    public ForBusiness checkPostAJobLink() {
        forBusinessLink.click();
        postAJobLink.click();
        return checkPostAJobLink();
    }

    public ForBusiness checkFindLeadsLink() {
        forBusinessLink.click();
        findLeadsLink.click();
        return checkFindLeadsLink();
    }

    public ForBusiness checkGroupLink() {
        forBusinessLink.click();
        groupLink.click();
        return checkGroupLink();
    }

    public ForBusiness checkServiceMarketPlace() {
        forBusinessLink.click();
        serviceMarketPlace.click();
        return checkServiceMarketPlace();
    }

    public ForBusiness checkAdvertiseLink() {
        forBusinessLink.click();
        advertiseLink.click();
        return checkAdvertiseLink();
    }


}
