import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\db\\users.db");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Users");
            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("Login") + " " +
                        rs.getString("Pass") + " " + rs.getString("Nick"));
            }
            System.out.println("connected");
        }
        catch (ClassNotFoundException classNotFoundException){
            System.out.println("Class not found");
        }
        catch (SQLException sqlException){
           System.out.println("sql error");
        }

    }
}