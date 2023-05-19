package com.linkedin.qa.testcases;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.pages.ForBusiness;
import com.linkedin.qa.pages.HomePage;
import com.linkedin.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForBusinessTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ForBusiness forBusiness;

    public ForBusinessTest() {
        super();
    }

    // Avoid dependency between TC. Relaunch Browser after each TC.
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        forBusiness = new ForBusiness();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }


    @Test
    public void learningTest() {
        try {
            forBusiness.checkLearningLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void insightsLinkTest() {
        try {
            forBusiness.checkInsightsLink();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    @Test
    public void postAJobLinkTest() {
        try {
            forBusiness.checkPostAJobLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void findLeadsLinkTest() {
        try {
            forBusiness.checkFindLeadsLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void groupLinkTest() {
        try {
            forBusiness.checkGroupLink();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test
    public void serviceMarketPlaceTest() {
        try {
            forBusiness.checkServiceMarketPlace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
