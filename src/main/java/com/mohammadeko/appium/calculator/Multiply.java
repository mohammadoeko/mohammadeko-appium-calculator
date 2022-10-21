package com.mohammadeko.appium.calculator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Multiply {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Testing");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");

        dc.setCapability("appPackage", "com.android.calculator2");

        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        System.out.println("Clik angka 3");

        WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        plus.click();
        System.out.println("Click perkalian");

        WebElement four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        four.click();
        System.out.println("Click angka 4");

        WebElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equals.click();
        System.out.println("Click sama dengan");

        WebElement results = driver.findElement(By.id("com.android.calculator2:id/result"));

        if(results.getText().equals("12"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }

        driver.quit();
    }
}
