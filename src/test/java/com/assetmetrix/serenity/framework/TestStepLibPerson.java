package com.assetmetrix.serenity.framework;

import com.assetmetrix.serenity.framework.person.CheckForPerson;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestStepLibPerson {

@Before
    public  void chromeDriverProperty() {

        Config.setChromeDriverProperty();

    }

 @Steps

    CheckForPerson checkForPerson;



@Test
    public void checksForPerson(){

        checkForPerson.isPersonInTheList();
        checkForPerson.isPhotoPresented();

    }




}
