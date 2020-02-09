package com.rename;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Register {

    private By register = By.xpath("//*[text()='Register']");
    private By usernameField = By.id("register-username-modal");
    private By firstNameField = By.id("register-first-modal");
    private By lastNameField  = By.id("register-last-modal");
    private By emailField  = By.id("register-email-modal");
    private By passwordField = By.id("register-password-modal");
    private By addOwnerBtn = By.xpath("//*[text()=' Register\n" +
            "                            ']");

    public void resistrationOfUser(String username, String firstName, String lastName, String email, String password){

        $(register).click();
        $(usernameField).setValue(username);
        $(firstNameField).setValue(firstName);
        $(lastNameField).setValue(lastName);
        $(emailField).setValue(email);
        $(passwordField).setValue(password);
        $(addOwnerBtn).click();


    }
}
