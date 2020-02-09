package com.rename;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Address {

    private By houseNumberField = By.id("form-number");
    private By streetNameField  = By.id("form-street");
    private By cityField = By.id("form-city");
    private By postCodeField = By.id("form-post-code");
    private By countryField = By.id("form-country");
    private By shippingAdress = By.xpath(@data-target="#address-modal")

    private By updateButton = By.xpath("//*[text()=' Update\n"+
            "                                                        ']");

    public void fillInAddressForm(String houseNumber, String streetName, String city, String postcode, String country){

        $(houseNumberField).setValue(houseNumber);
        $(streetNameField).setValue(streetName);
        $(cityField).setValue(city);
        $(postCodeField).setValue(postcode);
        $(countryField).setValue(country);
        $(updateButton).click();
    }


}
