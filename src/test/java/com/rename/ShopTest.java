package com.rename;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ShopTest extends BaseTestClass {

    @Test (priority = 1)
    public void registration(){
        open("http://167.172.110.35/");

        Register register = new Register();
        register.resistrationOfUser("Dmitriy", "D", "S", "rgb@gmail.com", "54fdt");
        }

    @Test (priority = 2)
    public void logInOfUser(){
        open("http://167.172.110.35/");

        LoginShop loginShop = new LoginShop();
        loginShop.logInUser();
    }

    @Test (priority = 3)
    public void findAndBuySocks(){
        open("http://167.172.110.35/");


        FindAndBuyGoods findAndBuyGoods= new FindAndBuyGoods();
        PageOfSocks pageOfSocks = new PageOfSocks();
        Address address = new Address();
        CreditCard creditCard = new CreditCard();

        findAndBuyGoods.goToCatalogue();
        findAndBuyGoods.checkPage();
        findAndBuyGoods.quantityToNineOfGoods();
        findAndBuyGoods.chooseSocks();
        pageOfSocks.clickBuyButton();
        findAndBuyGoods.goToBasket();
        address.fillInAddressForm("4", "Dmitriy","Dnipro", "49000","Ukraine");
        creditCard.fillInCreditCard("4589 4589 4898 1538","0422","458");

    }
}
