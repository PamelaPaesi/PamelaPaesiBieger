package TestesArq1;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.sql.ResultSet;
public class cenarioUm extends connection {

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2022.3/bin/geckodriver.exe");

        WebDriver driver= new FirefoxDriver();

        driver.get("https://advantageonlineshopping.com");
        Thread.sleep(10000);
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
        driver.findElement(By.id("see_offer_btn")).click();
        Thread.sleep(2000);
        try{
            String query = "select * from massas";
            ResultSet res = stmt.executeQuery(query);
            while (res.next())
            {
                for (int i = 1; i < 10; i++) {
                    assertTrue(driver.findElement(
                            By.xpath("//label[contains(text(), '" + res.getString(i) + "')]")
                    ).isDisplayed());
                }
            }
        } catch(Exception e) {
            driver.quit();
            e.printStackTrace();
        }
    }


}
