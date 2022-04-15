package com.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {
    @Test
    public void googleSearchTest(){
     open("https://www.google.com/");
     //$ is for findElement and $$ is for findElements
     $(By.name("q")).setValue("naveen automation labs");
     $(By.name("btnK")).click();
     $(By.xpath("//div[@class='logo doodle']//img[@title=\"Georges Seurat's 162nd Birthday\"]")).shouldHave(appear);
     String Header=$(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
     System.out.println(Header);
     Assert.assertEquals(Header,"Welcome to Naveen AutomationLabs - naveen automationlabs");
     int headerCount = $$(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).size();
        System.out.println(headerCount);
        //Assertion-shouldHave
      $$(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).shouldHave(CollectionCondition.size(12));

    }

}
