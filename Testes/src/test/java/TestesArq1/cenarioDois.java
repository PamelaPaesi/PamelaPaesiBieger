package TestesArq1;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        String texts = driver.findElement(By.xpath("//h3[@class='ng-binding']")).getText();
        assertEquals("HP PAVILION 15Z TOUCH LAPTOP", texts);
    }
}