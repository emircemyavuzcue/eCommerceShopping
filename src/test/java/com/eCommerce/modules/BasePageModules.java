package com.eCommerce.modules;

import com.eCommerce.pages.BasePage;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePageModules extends BrowserUtils {
    public static void randomProductSelector(By element) {
        waitForClickablility(element,10);
        List<WebElement> randomProduct = Driver.get().findElements(element);
        int randomNumber = randomNumberGenerator(0, randomProduct.size() - 1);
        randomProduct.get(randomNumber).click();
    }
}
