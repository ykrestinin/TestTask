package com.assetmetrix.serenity.framework.login;


import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import com.assetmetrix.serenity.framework.requests.ServiceHttpHeaders;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.*;
import org.junit.Assert;



public class LoginTest {


@Step("Attempt to login with valid credentials")


    public void loginValid(){



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("email", "coding.task@asset-metrix.com");
        requestBody.put("password", "ME4NbYYmH3qPTb");



        Response resp =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header(ServiceHttpHeaders.apiIdHeader())
                        .body(requestBody).
                        when()
                        .post("/login").
                        then()
                        .extract().response();

        Assert.assertEquals(resp.getStatusCode(), 200);

    }

@Step("Login with wrong password")

      public void loginInValid(){



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("email", "coding.task@asset-metrix.com");
        requestBody.put("password", "wrong_password");



        Response resp =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header(ServiceHttpHeaders.apiIdHeader())
                        .body(requestBody).
                        when()
                        .post("/login").
                        then()
                        .extract().response();


        Assert.assertEquals(resp.getStatusCode(), 401);

    }


@Step("Login with empty user and password")

    public void emptyPassword(){



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("email", "");
        requestBody.put("password", "");



        Response resp =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header(ServiceHttpHeaders.apiIdHeader())
                        .body(requestBody).
                        when()
                        .post("/login").
                        then()
                        .extract().response();


        Assert.assertEquals(resp.getStatusCode(), 401);

    }

    @Step("Login with user and password are not exist")

    public void invalidUserPassword(){



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("email", "test@test,com");
        requestBody.put("password", "789");



        Response resp =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header(ServiceHttpHeaders.apiIdHeader())
                        .body(requestBody).
                        when()
                        .post("/login").
                        then()
                        .extract().response();


        Assert.assertEquals(resp.getStatusCode(), 401);

    }

    @Step("Login with special characters in login/password")

    public void specialCharactersLoginPassword(){



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("email", "Aa!@#$%^&*()-_+=`~/,.?");
        requestBody.put("password", "Aa!@#$%^&*()-_+=`~,.?");



        Response resp =
                given()
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .header(ServiceHttpHeaders.apiIdHeader())
                        .body(requestBody).
                        when()
                        .post("/login").
                        then()
                        .extract().response();


        Assert.assertEquals(resp.getStatusCode(), 401);

    }

}

