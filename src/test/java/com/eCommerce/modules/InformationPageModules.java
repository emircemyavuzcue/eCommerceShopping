package com.eCommerce.modules;

import com.eCommerce.pages.InformationPage;
import com.eCommerce.utilities.BrowserUtils;
import com.eCommerce.utilities.Driver;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InformationPageModules extends BrowserUtils {
    public static void informationFiller() {
        click(InformationPage.countryBox);
        click(InformationPage.countryUSA);
        sendKeys(InformationPage.firstNameBox,"randomName");
        sendKeys(InformationPage.lastNameBox,"randomLastName");
        sendKeys(InformationPage.adressBox,"randomAdress");
        sendKeys(InformationPage.apartmentSuiteBox,"randomApartmentSuite");
        sendKeys(InformationPage.cityBox,"randomCity");
        click(InformationPage.stateBox);
        click(InformationPage.stateAlaska);
        sendKeys(InformationPage.zipBox,"99547");
        sendKeys(InformationPage.phoneBox,"436235423");
    }
}
