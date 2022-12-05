package TestesArq2.Teste3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.ResultSet;

public class cenarioTres extends connection{
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.id("menuSearch")).click();
        Thread.sleep(5000);
        try{
            String query = "select * from massas";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                driver.findElement(By.id("autoComplete")).sendKeys(res.getString("NAME_PRODUCT") );
            }
        } catch(Exception e) {
            driver.quit();
            e.printStackTrace();
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='product ng-scope']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='bunny productColor ng-scope BLACK']")).click();
        driver.findElement(By.xpath("//div[@class='plus']")).click();
        String valorProd = driver.findElement(
                By.xpath("//h2[@class='roboto-thin screen768 ng-binding']")
        ).getText().substring(1);
        String qtdProd = driver.findElement(By.name("quantity")).getAttribute("value");
        Float valorTotal = (Float.parseFloat(qtdProd) * Float.parseFloat(valorProd));
        driver.findElement(By.name("save_to_cart")).click();
        driver.findElement(By.id("checkOutPopUp")).click();
        Thread.sleep(500);
        WebElement total = driver.findElement(By.xpath("//span[@class='roboto-medium totalValue ng-binding']"));
        Float totalVenda = Float.parseFloat(total.getText().substring(1));
        assertEquals(valorTotal, totalVenda);
    }
}
