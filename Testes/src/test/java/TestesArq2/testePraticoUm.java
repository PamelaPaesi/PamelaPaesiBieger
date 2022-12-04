package TestesArq2;

import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class testePraticoUm {
    @Test
    public void test() throws InterruptedException {
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
        driver.findElement(By.linkText("Não sei meu CEP")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='mat-form-field-flex ng-tns-c157-64']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//mat-option[@id='mat-option-172']")).click();
        driver.findElement(By.id("mat-input-6")).sendKeys("Pinhalzinho");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//mat-option[@id='mat-option-176']")).click();
        driver.findElement(By.id("mat-select-1")).click();
        driver.findElement(By.id("mat-option-0")).click();
        driver.findElement(By.id("mat-input-7")).sendKeys("Natal");
        driver.findElement(By.xpath("//button[@class='modal__search-button']")).click();
        Thread.sleep(5000);
        WebElement m = driver.findElement(
                By.xpath("//div[@class='modal__enderecos__container ng-star-inserted']")
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 100;", m);
        Thread.sleep(5000);
        driver.findElement(By.id("endereco0")).click();
        driver.findElement(By.id("mat-input-1")).sendKeys("20534248691");
        driver.findElement(By.id("mat-input-2")).sendKeys("Bernardo Pedro Henrique Juan Dias");
        driver.findElement(By.id("mat-input-3")).sendKeys("(21) 98891-4304");
        driver.findElement(By.id("mat-input-4")).sendKeys("bernardo_pedro_dias@edepbr.com.br");
        driver.findElement(By.id("mat-input-5")).sendKeys("Iphone 11 pro max");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//mat-option[@id='mat-option-179']")).click();
        driver.findElement(By.xpath("//div[@class='mat-button-toggle-label-content']")).click();
        assertTrue(true);
    }
}
