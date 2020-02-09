package com.rename;

import com.codeborne.selenide.Configuration;

public class BaseTestClass {

    static {
        Configuration.baseUrl="http://167.172.110.35/";
        Configuration.timeout = 11000;
        //Configuration.browser = "firefox";
    }
}
