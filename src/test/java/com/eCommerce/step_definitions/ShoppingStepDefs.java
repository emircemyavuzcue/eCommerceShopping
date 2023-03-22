package com.eCommerce.step_definitions;

import com.eCommerce.modules.BasePageModules;
import com.eCommerce.modules.InformationPageModules;
import com.eCommerce.modules.PaymentPageModules;
import com.eCommerce.pages.*;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.ConfigurationReader;
import com.eCommerce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class ShoppingStepDefs {
    @Given("The user clicks login icon and logs in with correct credentials")
    public void the_user_clicks_login_icon_and_logs_in_with_correct_credentials() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.click(BasePage.loginIcon);
        BrowserUtils.sendKeys(LoginPage.emailBox, ConfigurationReader.get("emailForDev"));
        BrowserUtils.sendKeys(LoginPage.passwordBox, ConfigurationReader.get("passwordForDev"));
        BrowserUtils.waitFor(5);
        BrowserUtils.click(LoginPage.loginButton);
        String expected = "Log out";
        String actual = BrowserUtils.getTextOfAnElement(LoginPage.logOutButton);
        Assert.assertEquals(expected, actual);

    }

    @And("The user goes to main page")
    public void theUserGoesToMainPage() {
        Driver.get().navigate().to("https://shop-beta.cue.dev/");
    }

    @And("The user goes to Respiratory Health section on Products module")
    public void theUserGoesToRespiratoryHealthSectionOnProductsModule() {
        BrowserUtils.hover(BasePage.productsModule);
        BrowserUtils.click(BasePage.respiratoryHealth);
        BasePageModules.randomProductSelector(ProductPage.randomRespiratoryProduct);
    }

    @And("The user adds a random Respiratory Health product to the cart and checks out")
    public void theUserAddsARandomRespiratoryHealthProductToTheCartAndChecksOut() {
        BasePageModules.randomProductSelector(ProductPage.randomRespiratoryProduct);
        BrowserUtils.click(ProductPage.checkoutButton);
    }

    @And("The user adds fills the information boxes and clicks continue to payment")
    public void theUserAddsFillsTheInformationBoxesAndClicksContinueToPayment() {
        BrowserUtils.waitFor(5);
        boolean isShippingVisible = BrowserUtils.isElementVisible(InformationPage.shippingText);
        System.out.println(isShippingVisible);
        InformationPageModules.informationFiller();
        BrowserUtils.clickWithJS(InformationPage.continueToShippingButton);
        BrowserUtils.waitFor(5);
        if (isShippingVisible) {
            BrowserUtils.waitForClickablility(ShippingPage.continueToPaymentButton,10);
            BrowserUtils.clickWithJS(ShippingPage.continueToPaymentButton);
        }
    }

    @And("The user fills payment information and clicks Pay Now button")
    public void theUserFillsPaymentInformationAndClicksPayNowButton() {
        BrowserUtils.waitFor(5);
        PaymentPageModules.creditCardFiller();
        BrowserUtils.click(PaymentPage.payNowButton);
    }


}
