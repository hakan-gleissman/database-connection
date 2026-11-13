package se.sprinto.hakan.dbconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    static void main() {
        //IO.println(ConfigManager.getInstance().getProperty("db.url"));

        try (Connection connection = DatabaseManager.getInstance().getConnection()) {

            IO.println(connection.getMetaData());

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
