package com.mohammadeko.appium.calculator.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Add {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Testing");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);

        WebElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        one.click();
        System.out.println("Click button angka 1");

        WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        plus.click();
        System.out.println("Click button tambah");

        WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        two.click();
        System.out.println("Click button angka 2");

        WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        equals.click();
        System.out.println("Click button sama dengan");

        WebElement results = driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        if(results.getText().contains("3"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
