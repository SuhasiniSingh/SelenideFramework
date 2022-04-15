package com.tests;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class userActions {
    @Test(enabled = false )
    public void moveToElementTest() throws InterruptedException {
        open("https://www.spicejet.com/");
        SelenideElement AddOns=$(By.xpath("//div[text()='Add-ons']"));
        actions().moveToElement(AddOns).build().perform();
         Thread.sleep(5000);

        SelenideElement visaServices=$(By.xpath("//div[text()='Visa Services']"));
        visaServices.click();
        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void dragAnddropTest() throws InterruptedException {
        open("https://jqueryui.com/resources/demos/droppable/default.html");
        SelenideElement sourceEle=$(By.id("draggable"));
        SelenideElement targetEle=$(By.id("droppable"));
        actions()
                .clickAndHold(sourceEle)
                .moveToElement(targetEle)
                .release()
                .build().perform();

        Thread.sleep(5000);
    }

    @Test
    public void rightClickTest()throws InterruptedException{
         open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        SelenideElement rightClick=$(By.xpath("//span[text()='right click me']"));
        actions().contextClick(rightClick).build().perform();
        //actions().contextClick().build().perform();
        Thread.sleep(5000);
    }
}
