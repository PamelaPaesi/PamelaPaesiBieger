package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CenarioTres {
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='bunny productColor ng-scope YELLOW']")).click();
        driver.findElement(By.xpath("//div[@class='plus']")).click();
        driver.findElement(By.name("save_to_cart")).click();
        driver.findElement(By.id("checkOutPopUp")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(@class, 'roboto-medium totalValue ng-binding')]")).isDisplayed();
        System.out.print("O valor corresponde com o número de itens adicionados");
    }
}
