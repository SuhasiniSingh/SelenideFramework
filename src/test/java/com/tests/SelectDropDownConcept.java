package com.tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class SelectDropDownConcept {
    @Test
    public void userActionsTest() throws InterruptedException {
      open("https://www.orangehrm.com/orangehrm-30-day-trial/");
      //using selectOption
        $(By.id("Form_submitForm_Country")).selectOption(2);
        Thread.sleep(2000);
        $(By.id("Form_submitForm_Country")).selectOption("India");
        Thread.sleep(2000);
        $(By.id("Form_submitForm_Country")).selectOptionByValue("France");
        Thread.sleep(2000);
      //without using selectOption
       ElementsCollection colls = $$(By.cssSelector("select#Form_submitForm_Country option"));
        System.out.println(colls.size());
        for(SelenideElement e : colls){
           String text= e.getText();
            System.out.println(text);
           if(text.equals("Austria")){
               e.click();
               break;
           }
        }
        Thread.sleep(2000);

    }
}
