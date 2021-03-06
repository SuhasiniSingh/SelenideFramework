package com.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class HandleFrame {
    @Test
    public void FrameTest() throws InterruptedException {

        open("https://allwebco-templates.com/support/S_script_IFrame.htm");
        Thread.sleep(5000);
        switchTo().frame($(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']")));
        $(By.xpath("//img[@alt='Search']")).click();
        //Thread.sleep(5000);
        $(By.xpath("(//input[@name='terms'])[2]")).sendKeys("testing");
        $(By.xpath("//input[@name='submitbutton']")).click();
        switchTo().defaultContent(); //switch to main page
        String text=$(By.xpath("//span[text()='Sample website in an IFrame page']")).getText();
        System.out.println(text);
        Thread.sleep(5000);

    }

}
