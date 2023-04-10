package com.eCommerce.pages;

import org.openqa.selenium.By;

public class ProductDetailPage {
    public static final By randomPreferredStrength = By.xpath("(//div[@class='saturn-lifestyle-offer-option-item-list'])[1]//div[@class='saturn-lifestyle-offer-option-item']/div");
    public static final By randomMonthlyQuantity = By.xpath("(//div[@class='saturn-lifestyle-offer-option-item-list'])[2]//div[@class='saturn-lifestyle-offer-option-item']/div");
    public static final By randomShippingFrequency = By.xpath("(//div[@class='saturn-lifestyle-offer-option-item-list'])[3]//div//div");
    public static final By orderNowButton = By.xpath("//a[normalize-space()='ORDER NOW']");

}
