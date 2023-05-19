package com.linkedin.qa.testcases;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.pages.HomePage;
import com.linkedin.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        try {
            String title = loginPage.validateLoginPageTitle();
            Assert.assertEquals(title, "LinkedIn: Log In or Sign Up");
            log.info("loginPageTitle: " + title);
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 2)
    public void loginTest() {
        try {
            homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
            log.info("Proper login " + homePage);
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
