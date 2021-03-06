package com.duck.proj;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class duckProj extends DuckBase {

    @Test
    public void duckExam() {
        System.setProperty("selenide.browser", "Chrome");
        //вызываю браузер chrome
        open("http://litecart.com/en/");
        //подключила библиотеку selenide.open, откріваю сайт litecard.com

        createNewAccount();

        currencyChange();

        greenDuck();

        purpleDuck();

        shoppingCartConfirmOrder();

        homeButton();

        Logout();

    }

}

