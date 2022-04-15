package com.tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class FindElementsConcept {
    @Test
    public void findELements(){
        open("https://www.amazon.com/");
        ElementsCollection colls=$$(By.tagName("a"));
        System.out.println(colls.size());

        for(SelenideElement e : colls){
            String text=e.getText();
            System.out.println(text);
        }
    }
}
