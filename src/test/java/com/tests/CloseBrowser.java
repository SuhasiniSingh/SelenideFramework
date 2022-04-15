package com.tests;


import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CloseBrowser {
    @Test
    public void closeBrowserTest() throws InterruptedException {
        open("https://opensource-demo.orangehrmlive.com/");//parent -0
        System.out.println(title());
        //$-webelement or string cssselector,by seleniumselector,string cssselector index,by seleniumselectorindex
        $("img[alt='OrangeHRM on youtube']").click();//child-1
        System.out.println(title());
        switchTo().window(1);
        System.out.println(title());
        Thread.sleep(3000);
        closeWindow();//equivalent to close() which close the current window on which selenium running automated test
        switchTo().window(0);
        System.out.println(title());
        Thread.sleep(3000);
        closeWebDriver();//equivalent to quit which closes all the browser windows and terminates the webdriver session

    }
}
