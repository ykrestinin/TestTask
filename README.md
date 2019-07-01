# TestTask for AssetMetrix
These tests are based on Serenity test framework. For API tests i used restAssured library. Web part is based on Selenium Webdriver.


# Task Description
ServiceHttpHeaders.java and Config.java are used for configuration purposes, setting set of http headers, base URI and system property.


Tests for Login Endpoint are allocated in LoginTest.java. Tests for web are allocated in CheckForPerson.java
All tests are annotated with @Step annotation wich comes from Serenity Framework.

All steps are selected and orchestrated by TestStepLibLogin.java and TestStepLibPerson.java

# Preconfiguration.


To run tests successfull at the first step correct corresponding version of ChromeDriver should be installed.

Here is more info: https://sites.google.com/a/chromium.org/chromedriver/downloads

After installation webdriver.chrome.driver system property shoud be configured in Config.java class: path to executable file should be added:
 ```
 public static void setChromeDriverProperty(){

        System.setProperty("webdriver.chrome.driver","/Users/kre0001y/chromedriver/chromedriver");
    }
```




# How to run

To run tests execute
```
mvn verify
```

# Test Report
After test is run, Serenity framework generates test reports which you can find here:
'''
/git/AssetMetrix/target/site/serenity/index.html
'''
