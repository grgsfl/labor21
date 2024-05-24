import java.sql.SQLException;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
    String getNickByLoginPassDB(String login, String pass) throws SQLException, ClassNotFoundException;
}
