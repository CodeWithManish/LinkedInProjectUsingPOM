package com.linkedin.qa.testcases;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.pages.HomePage;
import com.linkedin.qa.pages.LoginPage;
import com.linkedin.qa.pages.ProfilePage;
import com.linkedin.qa.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;

    public ProfilePageTest() {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver, this);
    }

    // Avoid dependency between TC. Relaunch Browser after each TC.
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void toViewProfilePageTest() {
        try {
            profilePage.viewProfile();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test(priority = 2)
    public void toEditProfileTest() {
        try {
            profilePage.editProfile();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Test(priority = 3)
    public void toProfileBackgroundTest() {
        try {
            profilePage.profileBackground();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
