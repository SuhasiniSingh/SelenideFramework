package com.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class NavigationConcepts {

   @Test
    public void navigateTest() throws InterruptedException {
      open("https://www.google.com/");
       System.out.println(title());
       //navigate to url
       clearBrowserCookies();
       open("https://www.amazon.com/");
       System.out.println(title());
       back();
       System.out.println(title());
       forward();
       System.out.println(title());
       back();
       System.out.println(title());
       //Configuration.pageLoadTimeout=10000;
       Thread.sleep(5000);
       refresh();
    }


}
