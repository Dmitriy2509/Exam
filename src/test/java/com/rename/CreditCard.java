package com.rename;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreditCard {

    private By cardNumberField = By.id("form-card-number");
    private By expiresField = By.id("form-expires");
    private By ccvField = By.id("form-ccv");
    private By updateButtonField = By.xpath("//*[text()= Update\n" +
            "                                                ");

    public void fillInCreditCard(String cardNumber, String expires, String cvv ){
        $(cardNumberField).setValue(cardNumber);
        $(expiresField).setValue(expires);
        $(ccvField).setValue(cvv);
        $(updateButtonField).click();
    }
}
