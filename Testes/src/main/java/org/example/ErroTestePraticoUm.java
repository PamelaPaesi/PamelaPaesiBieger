package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
public class ErroTestePraticoUm {
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("web-driver.gecko.driver", "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

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
        driver.findElement(By.id("mat-input-0")).sendKeys("92020303");
        Thread.sleep(5000);
        driver.findElement(By.id("mat-input-1")).sendKeys("20534248691");
        driver.findElement(By.id("mat-input-2")).sendKeys("Bernardo Pedro Henrique Juan Dias");
        driver.findElement(By.id("mat-input-3")).sendKeys("(21) 98891-4304");
        driver.findElement(By.id("mat-input-4")).sendKeys("bernardo_pedro_dias@edepbr.com.br");
        driver.findElement(By.id("mat-input-5")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='mat-button-toggle-label-content']")).click();
        System.out.println("Preenchimento do campo obrigatório");
    }
}
