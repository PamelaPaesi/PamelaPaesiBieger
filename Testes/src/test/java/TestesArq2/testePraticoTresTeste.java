package TestesArq2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testePraticoTresTeste {
    static Connection con = null;
    private static Statement stmt;
    public static String DB_URL = "jdbc:mysql://127.0.0.1:3306/banco_teste_automacao";
    public static String DB_USER = "root";
    public static String DB_PASSWORD = "password";

    @BeforeTest
    public void setUp() throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

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
        }
        catch(Exception e)
        {
            driver.quit();
            e.printStackTrace();
        }
        driver.quit();
    }

    @AfterTest
    public void tearDown() throws Exception {
        if (con != null) {
            con.close();
        }
    }
}
