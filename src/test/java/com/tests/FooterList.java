package com.tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
public class FooterList {
    @Test
    public void elementTest(){
        open("https://www.freshworks.com/");
       ElementsCollection colls = $$(By.xpath("//footer//ul/li/a"));
        System.out.println(colls.size());

        /*for(SelenideElement e : colls){
           String text= e.getText();
            System.out.println(text);
        }*/
        List<String> footerList=colls.texts();
        footerList.forEach(e -> System.out.println(e));

    }
}
