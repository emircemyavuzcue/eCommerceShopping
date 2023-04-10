package com.eCommerce.step_definitions;

import com.eCommerce.modules.ProductDetailPageModules;
import com.eCommerce.pages.ProductDetailPage;
import com.eCommerce.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductDetailPageStepDefs {
    @Then("The user is on product detail page")
    public void theUserIsOnProductDetailPage() {
        BrowserUtils.waitFor(5);
    }

    @And("The user picks a random preferred strength")
    public void theUserPicksARandomPreferredStrength() {
        ProductDetailPageModules.randomPreferredStrengthSelector();
    }

    @And("The user picks a random monthly quantity")
    public void theUserPicksARandomMonthlyQuantity() {
        ProductDetailPageModules.randomMonthlyQuantitySelector();
    }

    @And("The user picks a random shipping frequency")
    public void theUserPicksARandomShippingFrequency() {
        BrowserUtils.waitFor(3);
        ProductDetailPageModules.randomShippingFrequencySelector();
    }

    @And("The user clicks order now button")
    public void theUserClicksOrderNowButton() {
        BrowserUtils.click(ProductDetailPage.orderNowButton);
    }
}
