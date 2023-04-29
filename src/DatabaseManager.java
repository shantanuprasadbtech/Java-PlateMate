import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "system";
    private static final String DB_NAME = "Restaurants";
    private static final String TABLE_NAME = "UserDetails";

    public static void createDatabase() {
        try (java.sql.Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE DATABASE " + DB_NAME;
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully!");

            String createTableSql = "CREATE TABLE IF NOT EXISTS records "
                    + "(id INT NOT NULL AUTO_INCREMENT,"
                    + " name VARCHAR(255) NOT NULL,"
                    + " contact VARCHAR(20) NOT NULL,"
                    + " no_of_guests INT NOT NULL,"
                    + " table_no INT NOT NULL,"
                    + " PRIMARY KEY (id))";
            stmt.executeUpdate(createTableSql);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    public static void InsertRecord(String name, int contact, int noOfGuests, int tableNo) {
        try (java.sql.Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {

            // Insert values entered by user into the table
            String insertSql = "INSERT INTO records (name, contact, no_of_guests, table_no) "
                    + "VALUES ('" + name + "', '" + contact + "', '" + noOfGuests + "', " + tableNo + ")";
            stmt.executeUpdate(insertSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}