package com.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;
public class WebDriverRunnerTest {
    @Test
    public void myTest(){
        open("https://opensource-demo.orangehrmlive.com/");
        WebDriverRunner.clearBrowserCache();
        System.out.println(WebDriverRunner.isFirefox());//false
        System.out.println(WebDriverRunner.isChrome());//true
        System.out.println(WebDriverRunner.url());
        WebDriverRunner.source();
        WebDriverRunner.supportsJavascript();//return boolean
       String title= WebDriverRunner.getWebDriver().getTitle();
        System.out.println(title);
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverRunner.driver().close();
        WebDriverRunner.closeWebDriver();






    }
}
