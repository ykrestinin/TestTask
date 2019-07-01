package com.assetmetrix.serenity.framework.person;
import static org.junit.Assert.assertTrue;

import com.assetmetrix.serenity.framework.Config;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckForPerson {



@Step("Check if Person is in the list")

    public void isPersonInTheList(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.asset-metrix.com/ueber-uns/team/");

        boolean isPersonPresent;

    try {

        driver.findElement(By.xpath("//*[contains(.,'Lena Pawliczki')]"));
        isPersonPresent = true;
    }
    catch (NoSuchElementException e) {
        isPersonPresent = false;
    }


    assertTrue(isPersonPresent);


    driver.quit();


   }

@Step("Check if Person's photo is presented and displayed")


    public void isPhotoPresented(){

       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://www.asset-metrix.com/ueber-uns/team/");
       boolean isPhotoPresent;


       try {

        driver.findElement(By.xpath("/html/body/div[2]/section[1]/div[57]/article/img")).isDisplayed();
            isPhotoPresent = true;
       }
       catch (NoSuchElementException e){
           isPhotoPresent = false;

   }

       assertTrue(isPhotoPresent);

       driver.quit();


}




}
