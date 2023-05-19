package com.linkedin.qa.testcases;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.pages.HomePage;
import com.linkedin.qa.pages.LoginPage;
import com.linkedin.qa.pages.MyNetwork;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyNetworkTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    MyNetwork myNetwork;

    public MyNetworkTest() {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver, this);
    }

    // Avoid dependency between TC. Relaunch Browser after each TC.
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        myNetwork = new MyNetwork();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void checkMyNetworkTest() {
        try {
            myNetwork.checkConnectionLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void checkContactsLinkTest() {
        try {
            myNetwork.checkContactsLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void checkFollowingAndFollowersLinkTest() {
        try {
            myNetwork.checkFollowingAndFollowersLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void checkGroupsLinkTest() {
        try {
            myNetwork.checkGroupsLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void checkEventsLinkTest() {
        try {
            myNetwork.checkEventsLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
