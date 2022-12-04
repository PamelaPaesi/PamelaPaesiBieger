package TestesArq1;

import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cenarioUm {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(10000);
        assertTrue(driver.findElement(
                By.xpath("//h2[contains(text(), 'PRODUCT SPECIFICATION')]")
            ).isDisplayed());
    }
}
