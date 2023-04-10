package com.eCommerce.modules;

import com.eCommerce.pages.PaymentPage;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentPageModules extends BrowserUtils {
    public static void creditCardFiller() {
        WebElement frameElement=Driver.get().findElement(By.xpath("(//iframe[@class='card-fields-iframe'])[1]"));
        Driver.get().switchTo().frame(frameElement);
        sendKeys(PaymentPage.cardNumber, "4242");
        sendKeys(PaymentPage.cardNumber, "4242");
        sendKeys(PaymentPage.cardNumber, "4242");
        sendKeys(PaymentPage.cardNumber, "4242");
        Driver.get().switchTo().defaultContent();
        WebElement frameElementName=Driver.get().findElement(By.xpath("(//iframe[@class='card-fields-iframe'])[2]"));
        Driver.get().switchTo().frame(frameElementName);
        sendKeys(PaymentPage.nameOnCard, "asd qwe");
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);
        WebElement frameElementExpirationDate=Driver.get().findElement(By.xpath("(//iframe[@class='card-fields-iframe'])[3]"));
        Driver.get().switchTo().frame(frameElementExpirationDate);
        sendKeys(PaymentPage.expirationMonth, "12");
        sendKeys(PaymentPage.expirationYear, "28");
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);
        WebElement frameElementSecurityCode=Driver.get().findElement(By.xpath("(//iframe[@class='card-fields-iframe'])[4]"));
        Driver.get().switchTo().frame(frameElementSecurityCode);
        sendKeys(PaymentPage.securityCode, "123");
        Driver.get().switchTo().defaultContent();
        clickWithJS(PaymentPage.checkBox);
    }

}
