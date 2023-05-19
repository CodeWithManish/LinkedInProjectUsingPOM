package com.linkedin.qa.pages;

import com.linkedin.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //page factory - object repository:
    @FindBy(id = "session_key")
    WebElement username;

    @FindBy(id = "session_password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//span[@title='Home']")
    WebElement homebtn;

    //Initialize page objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    //Actions
    public String validateLoginPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }

}
