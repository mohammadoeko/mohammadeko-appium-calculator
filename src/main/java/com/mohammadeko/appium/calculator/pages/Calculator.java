package com.mohammadeko.appium.calculator.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
    By btnDua = By.id("com.google.android.calculator:id/digit_2");
    By btnTiga = By.id("com.google.android.calculator:id/digit_3");
    By btnEmpat = By.id("com.google.android.calculator:id/digit_4");
    By btnTambah = By.id("com.google.android.calculator:id/op_add");
    By btnPerkalian = By.id("com.google.android.calculator:id/op_mul");
    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
    By hasil = By.id("com.google.android.calculator:id/result_final");
//    /* web: xpath = //taghtml[contains(@attr, value)] */

    //Method
    public void calcAdd() {
        driver.findElement(btnSatu).click();
        System.out.println("Click button angka 1");
        driver.findElement(btnTambah).click();
        System.out.println("Click button tambah");
        driver.findElement(btnDua).click();
        System.out.println("Click button angka 2");
        driver.findElement(btnSamaDengan).click();
        System.out.println("Click button sama dengan");
    }

    public void calcMultiply() {
        driver.findElement(btnTiga).click();
        System.out.println("Click button angka 3");
        driver.findElement(btnPerkalian).click();
        System.out.println("Click button perkalian");
        driver.findElement(btnEmpat).click();
        System.out.println("Click button angka 4");
        driver.findElement(btnSamaDengan).click();
        System.out.println("Click button sama dengan");
    }

    //
    public String getTxtResult() {
        return driver.findElement(hasil).getText();
    }
}
