package com.rename;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginShop {

    private By username = By.id("username-modal");
    private By password  = By.id("password-modal");
    private By login = By.xpath("//*[text()='Login']");
    private By logIn = By.xpath("//*[text()=' Log in\n" +
            "                            ']");

    public String userName = "Dmitriy";
    public String passwordOfUser = "54fdt";
    public String infSuccessMessage;

    public LoginShop logInUser(){

        $(login).click();
        $(username).setValue(userName);
        $(password).setValue(passwordOfUser);
        $(logIn).click();

        return this;
    }
}
