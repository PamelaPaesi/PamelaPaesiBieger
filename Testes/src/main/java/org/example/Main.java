package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args)  throws InterruptedException{
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
    }
}