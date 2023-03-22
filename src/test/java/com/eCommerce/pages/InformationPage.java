package com.eCommerce.pages;

import org.openqa.selenium.By;

public class InformationPage {
    public static final By countryBox = By.xpath("//select[@placeholder='Country/region']");
    public static final By countryUSA = By.xpath("//select[@placeholder='Country/region']//option[@value='United States']");
    public static final By firstNameBox = By.xpath("//input[@placeholder='First name']");
    public static final By lastNameBox = By.xpath("//input[@placeholder='Last name']");
    public static final By adressBox = By.xpath("//input[@placeholder='Address']");
    public static final By apartmentSuiteBox = By.xpath("//input[@placeholder='Apartment, suite, etc. (optional)']");
    public static final By cityBox = By.xpath("//input[@placeholder='City']");
    public static final By stateBox = By.xpath("//select[@placeholder='State']");
    public static final By stateAlaska = By.xpath("//select[@placeholder='State']//option[@data-alternate-values='[\"Alaska\"]']");
    public static final By zipBox = By.xpath("//input[@placeholder='ZIP code']");
    public static final By phoneBox = By.xpath("//input[@placeholder='Phone']");
    public static final By continueToShippingButton = By.xpath("//span[contains(text(), \"Continue \")]");
    public static final By shippingText = By.xpath("//span[@class='breadcrumb__text'][normalize-space()='Shipping']");

}
