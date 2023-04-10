package com.eCommerce.modules;

import com.eCommerce.pages.ProductDetailPage;

public class ProductDetailPageModules {
    public static void randomPreferredStrengthSelector() {
        BasePageModules.randomProductSelectorWithJsClick(ProductDetailPage.randomPreferredStrength);
    }

    public static void randomMonthlyQuantitySelector() {
        BasePageModules.randomProductSelectorWithJsClick(ProductDetailPage.randomMonthlyQuantity);
    }

    public static void randomShippingFrequencySelector() {
        BasePageModules.randomProductSelectorWithJsClick(ProductDetailPage.randomShippingFrequency);
    }
}
