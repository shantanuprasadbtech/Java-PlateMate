import java.sql.*;

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
                    + " PRIMARY KEY (id))";
            stmt.executeUpdate(createTableSql);

        } catch (SQLException e) {
            System.out.println("Error creating database: " + e.getMessage());
        }
    }

    public static void createTable() {
        try (Connection conn = DriverManager.getConnection(DB_URL + DB_NAME, DB_USERNAME, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {



            // Insert values entered by user into the table
            String insertSql = "INSERT INTO records (name, contact, no_of_guests) "
                    + "VALUES ('" + name + "', '" + contact + "', " + noOfGuests + ")";
            stmt.executeUpdate(insertSql);
            System.out.println("Record inserted successfully!");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}




        try (java.sql.Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {


                String dbName = "mydb";
                String sql = "CREATE DATABASE " + dbName;
                stmt.executeUpdate(sql);
                System.out.println("Database created successfully!");


            String name = "John Doe";
            String contact = "1234567890";
            int noOfGuests = 4;

            // Create a table called "records"
            String createTableSql = "CREATE TABLE IF NOT EXISTS records "
                    + "(id INT NOT NULL AUTO_INCREMENT,"
                    + " name VARCHAR(255) NOT NULL,"
                    + " contact VARCHAR(20) NOT NULL,"
                    + " no_of_guests INT NOT NULL,"
                    + " PRIMARY KEY (id))";
            stmt.executeUpdate(createTableSql);

            // Insert values entered by user into the table
            String insertSql = "INSERT INTO records (name, contact, no_of_guests) "
                    + "VALUES ('" + name + "', '" + contact + "', " + noOfGuests + ")";
            stmt.executeUpdate(insertSql);
            System.out.println("Record inserted successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
