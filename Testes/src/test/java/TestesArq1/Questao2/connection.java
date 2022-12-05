package TestesArq1.Questao2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    public static String DB_URL = "jdbc:mysql://127.0.0.1:3306/banco_teste_automacao";
    public static String DB_USER = "root";
    public static String DB_PASSWORD = "password";
    public static Connection con = null;
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
