package TestesArq2.Teste3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class cenarioQuatro {
    @Test
    public void test() throws InterruptedException  {
        System.setProperty("webdriver.gecko.driver", "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='bunny productColor ng-scope YELLOW']")).click();
        driver.findElement(By.xpath("//div[@class='plus']")).click();
        driver.findElement(By.name("save_to_cart")).click();
        driver.findElement(By.id("shoppingCartLink")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='remove red ng-scope']")).click();
        Thread.sleep(2000);
        assertTrue(driver.findElement(By.xpath("//label[@class='roboto-bold ng-scope']")).isDisplayed());
        System.out.println("Seu carrinho está vazio");
    }
}
