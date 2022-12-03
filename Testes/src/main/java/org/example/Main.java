package org.example;

import io.netty.handler.codec.ByteToMessageCodec;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//h2[contains(text(), 'PRODUCT SPECIFICATION')]")).isDisplayed();
        System.out.print("PRODUCT SPECIFICATIONS is visible");
    }
}
