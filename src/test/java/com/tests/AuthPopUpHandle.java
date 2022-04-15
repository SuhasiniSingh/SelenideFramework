package com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;

public class AuthPopUpHandle {
    @Test
    public void authPopTest() throws MalformedURLException {
     //open("https://the-internet.herokuapp.com/basic_auth");
     //open("https://the-internet.herokuapp.com/basic_auth","","admin","admin");
     System.setProperty("selenide.browser","Edge");
     open(new URL("https://the-internet.herokuapp.com/basic_auth"),"","admin","admin");
     String text=$(By.cssSelector("div.example")).getText();
     System.out.println(text);
     Assert.assertTrue(text.contains("Congratulations"));
    }
}
