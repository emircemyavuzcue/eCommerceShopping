package com.eCommerce.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By emailBox=By.xpath("//input[@id='login-email']");
    public static final By passwordBox=By.xpath("//input[@id='login-password']");
    public static final By loginButton=By.xpath("//button[@id='login-btn']");
    public static final By logOutButton=By.xpath("//a[@class='btn-link']");
    public static final By enterUsingPasswordButton=By.xpath("//button[@class='btn btn--clear password__open-modal']");
    public static final By yourPasswordBox=By.xpath("//input[@placeholder='Your password']");
    public static final By enterButton=By.xpath("(//button[@type='submit'])[2]");
}
