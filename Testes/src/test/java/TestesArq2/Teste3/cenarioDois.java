package TestesArq2.Teste3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class cenarioDois {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("web-driver.gecko.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[@class='bunny productColor ng-scope YELLOW']")).click();
        driver.findElement(By.name("save_to_cart")).click();
        Thread.sleep(500);
        driver.findElement(By.id("shoppingCartLink")).click();
        Thread.sleep(3000);
        String title = driver.findElement(
                By.xpath("//span[@class='productColor']")
        ).getAttribute("title");
        assertEquals("YELLOW", title);
    }
}
