package com.assetmetrix.serenity.framework.requests;
import io.restassured.http.Header;

public class ServiceHttpHeaders {

    public static Header apiIdHeader() {


        return new Header("X-Api-Id", "lp_services_3");
    }


}
