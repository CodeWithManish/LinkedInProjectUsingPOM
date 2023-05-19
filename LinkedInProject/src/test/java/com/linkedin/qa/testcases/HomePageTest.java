package com.linkedin.qa.testcases;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.pages.HomePage;
import com.linkedin.qa.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver,this);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        try {
            String homePageTitle = homePage.verifyHomePageTitle();
            Assert.assertEquals(homePageTitle, "(1) Feed | LinkedIn", "Home Page is match!");
            log.info("HomePageTitle: " + homePageTitle);
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 2)
    public void verifyUserNameTest() {
        try {
            Assert.assertTrue(homePage.verifyHomePageLink());
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 3)
    public void toClickMyNetworkTest(){
        try {
            homePage = new HomePage();
            homePage.clickMyNetworkLink();
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 4)
    public void toClickJobsTest(){
        try {
            homePage = new HomePage();
            homePage.clickJobsLink();
        }catch (Exception e){
            e.getStackTrace();
        }


    }

    @Test(priority = 5)
    public void toClickMessagingTest(){
        try {
            homePage = new HomePage();
            homePage.clickMessagingLink();
        }catch (Exception e){
            e.getStackTrace();
        }

    }

    @Test(priority = 6)
    public void toClickOnNotificationsTest(){
        try {
            homePage = new HomePage();
            homePage.clickOnNotificationsLink();
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 7)
    public void toClickProfileTest(){
        try {
            homePage = new HomePage();
            homePage.clickProfileLink();
        }catch (Exception e){
            e.getStackTrace();
        }
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
