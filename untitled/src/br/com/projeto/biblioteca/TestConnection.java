import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/biblioteca";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Conectado ao banco!");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}