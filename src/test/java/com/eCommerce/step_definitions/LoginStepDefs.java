package com.eCommerce.step_definitions;

import com.eCommerce.pages.BasePage;
import com.eCommerce.pages.LoginPage;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.ConfigurationReader;
import com.eCommerce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("The user clicks enter using your password icon and logs in with correct credentials")
    public void theUserClicksEnterUsingYourPasswordIconAndLogsInWithCorrectCredentials() {
        Driver.get().get(ConfigurationReader.get("urlDev"));
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(LoginPage.enterUsingPasswordButton);
        BrowserUtils.waitFor(3);
        BrowserUtils.sendKeys(LoginPage.yourPasswordBox, "$peed0fLife");
        BrowserUtils.click(LoginPage.enterButton);
    }

    @Given("The user clicks login icon")
    public void theUserClicksLoginIcon() {
        BrowserUtils.click(BasePage.loginIcon);
    }

    @And("The user logs in with correct credentials")
    public void theUserLogsInWithCorrectCredentials() {
        BrowserUtils.sendKeys(LoginPage.emailBox, ConfigurationReader.get("emailForDev"));
        BrowserUtils.sendKeys(LoginPage.passwordBox, ConfigurationReader.get("passwordForDev"));
        BrowserUtils.waitFor(5);
        BrowserUtils.click(LoginPage.loginButton);
        String expected = "Log out";
        String actual = BrowserUtils.getTextOfAnElement(LoginPage.logOutButton);
        Assert.assertEquals(expected, actual);
    }
}
