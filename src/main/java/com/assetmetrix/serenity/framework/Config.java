package com.assetmetrix.serenity.framework;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Config {


    public static void setBaseUri(){

        RestAssured.baseURI = "https://point3.asset-metrix.com/api/v1/";
    }

    public static void setChromeDriverProperty(){

        System.setProperty("webdriver.chrome.driver","/Users/kre0001y/chromedriver/chromedriver");


    }
}
