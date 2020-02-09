package com.rename;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindAndBuyGoods {

    private By catalogue = By.xpath("//*[text()='Catalogue']");
    private By nineQuantity = By.xpath("//div[@id='products-number']/a[3]");

    private By chooseSocks = By.xpath("//*[text()='Nerd leg']");
    private By checkPage = By.xpath("//*[text()='Catalogue']");
    private By basket = By.xpath("//div[@id='basket-overview']/a");
    private Object PageOfSocks;
    private String priceOnSocks;
    private String priceOfBasket;


    public void goToCatalogue(){
        $(catalogue).click();
    }

    public void checkPage(){
        $(checkPage).shouldBe(Condition.appear);
    }

    public void quantityToNineOfGoods(){
        $(nineQuantity).click();
    }

    public void chooseSocks(){
        $(chooseSocks).click();
    }

    public void goToBasket(){
       $(basket).click();
    }
//    public void checkPrice(){
//       $(priceOfBasket).shouldHave(Co)
//    }

}
