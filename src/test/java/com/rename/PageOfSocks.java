package com.rename;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageOfSocks {

    private By buyButton = By.id("buttonCart");
    private By checkPage = By.xpath("//*[text()='Nerd leg']");


    public void clickBuyButton(){
        $(checkPage).shouldBe(Condition.appear);
        $(buyButton).click();

    }

}
