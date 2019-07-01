package com.assetmetrix.serenity.framework;
import com.assetmetrix.serenity.framework.login.LoginTest;
import com.assetmetrix.serenity.framework.person.CheckForPerson;
import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class TestStepLibLogin {

  @Before
  public  void setBaseUri() {

    Config.setBaseUri();
    RestAssured.port =443;


  }

  @Steps

  LoginTest loginTest;

@Test
    public void loginAttempts(){

      loginTest.loginValid();
      loginTest.loginInValid();
      loginTest.emptyPassword();
      loginTest.invalidUserPassword();
      loginTest.specialCharactersLoginPassword();


  }

}
