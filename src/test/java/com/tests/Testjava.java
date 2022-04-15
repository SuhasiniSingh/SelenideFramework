package com.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class Testjava {
    //testing method overloading
   public void m1(Double s, int a){

        System.out.println(s+a);
    }
    public void m1(int a,Double s){
        //System.out.println(s);
        System.out.println(s+a);
    }
    public static void main(String[] args) {
        Testjava t = new Testjava();
        t.m1(20.1,20);
        t.m1(30.2,30);

    }
    //testing beforetest testng
    //conclusion:beforetest and before class works similar but before method works different from test and class
    //before test and beforeclass execution pattern:execute first/first test/secondtest/third test/execute at the end
    //before&after method pattern:execute first/first test/execute at the end/execute first/second test/execute at the end/....
    @BeforeMethod
    public void setup(){
        System.out.println("execute first");
        Configuration.browser="chrome";
    }
    @Test
    public void test1(){
        System.out.println("first test");
        open("https://www.google.com/");
    }
    @Test
    public void test2(){
        System.out.println("second test");
        open("https://www.facebook.com/");
    }
    @Test
    public void test3(){
        System.out.println("third test");
        open("https://twitter.com/");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("execute at the end");
    }


}
