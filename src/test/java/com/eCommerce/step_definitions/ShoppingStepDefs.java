package com.eCommerce.step_definitions;

import com.eCommerce.modules.BasePageModules;
import com.eCommerce.modules.InformationPageModules;
import com.eCommerce.modules.PaymentPageModules;
import com.eCommerce.pages.*;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShoppingStepDefs {

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
        InformationPageModules.informationFiller();
        BrowserUtils.clickWithJS(InformationPage.continueToShippingButton);
        BrowserUtils.waitFor(10);
        if (isShippingVisible) {
            BrowserUtils.clickWithJS(ShippingPage.continueToPaymentButton);
        }
    }

    @And("The user fills payment information and clicks Pay Now button")
    public void theUserFillsPaymentInformationAndClicksPayNowButton() {
        BrowserUtils.waitFor(8);
        PaymentPageModules.creditCardFiller();
        BrowserUtils.clickWithJS(PaymentPage.payNowButton);
    }

    @Then("The user makes sure the payment is successful")
    public void theUserMakesSureThePaymentIsSuccessful() {
        BrowserUtils.waitFor(3);
        String expected = "Your order is confirmed";
        String actual = BrowserUtils.getTextOfAnElement(ConfirmationPage.confirmationText);
        Assert.assertEquals(expected, actual);
    }

    @And("The user picks a random product on main page")
    public void theUserPicksARandomProductOnMainPage() {
        BasePageModules.randomProductSelectorWithJsClick(BasePage.randomProducts);
    }
}
