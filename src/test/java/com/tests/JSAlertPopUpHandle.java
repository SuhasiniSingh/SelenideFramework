package com.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class JSAlertPopUpHandle {

    @Test(enabled=false)
    public void alertTest() throws InterruptedException {
        open("https://mail.rediff.com/cgi-bin/login.cgi");
        $(By.name("proceed")).click();
        Thread.sleep(2000);
        Alert alert =switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Please enter a valid user name");
        alert.accept();// ok button
       // alert.dismiss();//cancel the alert
    }

    @Test
    public void alertTest1(){
        open("https://the-internet.herokuapp.com/");
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        System.out.println("First JS Alert....");
        $(By.xpath("//a[text()='JavaScript Alerts']")).click();
        $(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert= switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        Assert.assertEquals(text,"I am a JS Alert");
        alert.accept();
        System.out.println("Second JS Alert...");
        $(By.xpath("//button[text()='Click for JS Confirm']")).click();
        String getText=alert.getText();
        System.out.println(getText);
        Assert.assertEquals(getText,"I am a JS Confirm");
        alert.dismiss();
        System.out.println("Third JS Alert....");
        $(By.xpath("//button[text()='Click for JS Prompt']")).click();
        String promptmsg=alert.getText();
        System.out.println(promptmsg);
        Assert.assertEquals(promptmsg,"I am a JS prompt");
        alert.sendKeys("yes");
        alert.accept();
    }



}
