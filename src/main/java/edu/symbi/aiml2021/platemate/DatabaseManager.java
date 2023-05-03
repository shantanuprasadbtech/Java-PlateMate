package edu.symbi.aiml2021.platemate;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    public static void createDatabase() {
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "system");
             Statement stmt = conn.createStatement()) {

            String CreateSql = "CREATE DATABASE IF NOT EXISTS " + "platemate";
            stmt.executeUpdate(CreateSql);
            String UseSql = "Use platemate";
            stmt.executeUpdate(UseSql);
            String createTableSql = "CREATE TABLE IF NOT EXISTS menucard "
                    + "(id int primary key auto_increment,"
                    + " name varchar(20) NOT NULL,"
                    + " price numeric NOT NULL,"
                    + " description varchar(100) NOT NULL,"
                    + " status boolean)";
            stmt.executeUpdate(createTableSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void InsertRecord(int id, String name, int price, String description, Boolean status) {
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "system");
             Statement stmt = conn.createStatement()) {

            // Insert values entered by user into the table
            String insertSql = "INSERT INTO menucard (name, price, description, status) "
                    + "VALUES ('" + name + "', '" + price + "', '" + description + "', " + status + ")";
            stmt.executeUpdate(insertSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void DeleteRecord(int id){
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "system");
             Statement stmt = conn.createStatement()) {

            String DeleteSql = "DELETE FROM menucard WHERE id= " + id;
            stmt.executeUpdate(DeleteSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void UpdateRecord(int id){
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "system");
             Statement stmt = conn.createStatement()) {

            String DeleteSql = "UPDATE menucard SET "
                    + "name = " + name
                    + "price = " ('" + id + "', '" + name + "', '" + price + "', " + description + ")";
            stmt.executeUpdate(DeleteSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
