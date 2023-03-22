package com.eCommerce.modules;

import com.eCommerce.pages.PaymentPage;
import com.eCommerce.utilities.BrowserUtils;

public class PaymentPageModules extends BrowserUtils {
    public static void creditCardFiller() {
        clickWithJS(PaymentPage.cardNumber);
        sendKeys(PaymentPage.cardNumber, "1234123412341234");
        sendKeys(PaymentPage.nameOnCard, "asd qwe");
        sendKeys(PaymentPage.expirationDate, "12/28");
        sendKeys(PaymentPage.securityCode, "123");
    }

}
