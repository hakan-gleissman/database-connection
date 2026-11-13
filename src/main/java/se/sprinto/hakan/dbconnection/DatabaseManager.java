package se.sprinto.hakan.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final DatabaseManager INSTANCE = new DatabaseManager();

    private DatabaseManager() {

    }

    public static DatabaseManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() throws SQLException {
        ConfigManager configManager = ConfigManager.getInstance();
        String url = configManager.getProperty("db.url");
        String user = configManager.getProperty("db.user");
        String pass = configManager.getProperty("db.password");
        return DriverManager.getConnection(url, user, pass);
    }
}
