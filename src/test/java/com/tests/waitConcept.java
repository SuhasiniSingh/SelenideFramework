package com.tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
public class waitConcept {
    @Test
   public void waitTest() {
        //default timeout in selenide is 4seconds
        Configuration.timeout=5000;
        open("https://api.cogmento.com/register/");
        SelenideElement login =$(By.partialLinkText("Log in here"));
        login.click();
        SelenideElement email=$(By.name("email"));
        //email.sendKeys("suhas");
        email.should(Condition.appear, Duration.ofSeconds(10)).sendKeys("suhas");
        $(By.linkText("Sign Up")).click();
        SelenideElement checkBox=$(By.name("terms"));
        checkBox.click();
        checkBox.should(Condition.checked);
        //checkBox.shouldBe(Condition.checked);
        //checkBox.shouldNot(Condition.checked,Duration.ofSeconds(10));
    }
}
