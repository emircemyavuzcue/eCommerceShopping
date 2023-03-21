package com.eCommerce.step_definitions;

import com.eCommerce.pages.BasePage;
import com.eCommerce.pages.LoginPage;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.ConfigurationReader;
import com.eCommerce.utilities.Driver;
import io.cucumber.java.en.Given;

public class ShoppingStepDefs {
    @Given("The user clicks login icon and logs in with correct credentials")
    public void the_user_clicks_login_icon_and_logs_in_with_correct_credentials() {
        //Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.click(BasePage.loginIcon);
        BrowserUtils.sendKeys(LoginPage.emailBox,ConfigurationReader.get("emailForDev"));
        BrowserUtils.sendKeys(LoginPage.passwordBox,ConfigurationReader.get("passwordForDev"));
        BrowserUtils.click(LoginPage.loginButton);
    }
}
