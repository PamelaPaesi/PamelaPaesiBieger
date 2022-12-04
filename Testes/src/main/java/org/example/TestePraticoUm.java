package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class TestePraticoUm {
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.portoseguro.com.br/celular");
        Thread.sleep(5000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("botao-abertura_oldd")).click();
        List<String> abas = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(abas.get(1));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='ctaColor']")).click();
        driver.findElement(By.linkText("Não sei meu CEP")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='mat-form-field-flex ng-tns-c157-64']")).click();
        Thread.sleep(5000);
        driver.findElement(
                By.xpath("//span[contains(@class, 'mat-option-text') and contains(text()='SC')]")

        ).click();
    }
}
