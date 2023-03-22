package com.eCommerce.pages;

import org.openqa.selenium.By;

public class PaymentPage {
    public static final By cardNumber = By.xpath("//label[normalize-space()='Card number']");
    public static final By nameOnCard = By.xpath("//input[@placeholder='Name on card']");
    public static final By expirationDate = By.xpath("//input[@placeholder='Expiration date (MM / YY)']");
    public static final By securityCode = By.xpath("//input[@placeholder='Security code']");
    public static final By payNowButton = By.xpath("(//span[contains(text(), \"Pay \")])[1]");

}
