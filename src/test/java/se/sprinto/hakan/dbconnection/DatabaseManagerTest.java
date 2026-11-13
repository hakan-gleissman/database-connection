package se.sprinto.hakan.dbconnection;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class DatabaseManagerTest {

    @Test
    void testH2Connection() {
        try (Connection connection = DatabaseManager.getInstance().getConnection()) {
            IO.println(connection.getMetaData());
            assertNotNull(connection);
        } catch (SQLException e) {
            fail("Vi borde få en connection till databasen");
        }
    }

}
