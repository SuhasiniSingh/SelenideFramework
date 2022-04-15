package com.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LaunchBrowsersTest {
   @Test
    public void launchBrowserTest(){
       //default browser is chrome and headless mode is false
      //By default screenshot is true
       Configuration.browser = "firefox";
       /*System.setProperty("selenide.browser","chrome");
       //System.setProperty("selenide.browserBinary","/users/downloads/firefox.exe");
       //Configuration.headless=true;
       //Configuration.screenshots=false;*/
       Configuration.pageLoadTimeout=8000;
       Configuration.baseUrl="https://accounts.google.com/";
       open("/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com");
       $(By.cssSelector("div#logo")).shouldHave(Condition.appear);
   }
}
