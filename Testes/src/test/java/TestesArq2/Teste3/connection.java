package TestesArq2.Teste3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/banco_teste_automacao";
    private static String DB_USER = "root";
    private static String DB_PASSWORD = "password";
    private static Connection con = null;
    public static Statement stmt;
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
    @AfterTest
    public void tearDown() throws Exception {
        if (con != null) {
            con.close();
        }
    }
}
