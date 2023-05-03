package edu.symbi.aiml2021.platemate;
import com.sun.tools.javac.Main;

import java.util.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        try {
            System.out.println("Enter your MySQL server username: ");
            String username = sc.nextLine();
            System.out.println("Enter your MySQL server password: ");
            String password = sc.nextLine();

            DatabaseManager dm = new DatabaseManager();
            dm.createDatabase(username, password);

            System.out.println("Enter which task you want: ");
            System.out.println("1) Add menu item");
            System.out.println("2) Delete menu item");
            System.out.println("3) Update menu item");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter item price: ");
                    int price = sc.nextInt();
                    System.out.println("Enter item description: ");
                    String description = sc.nextLine();
                    System.out.println("Enter item availability status (True or False): ");
                    Boolean status = sc.nextBoolean();
                    dm.insertRecord(username, password, name, price, description, status);
                    System.out.println("Menu item successfully added: ");
                    break;
                case 2:
                    System.out.println("Enter id of item to delete: ");
                    int id = sc.nextInt();
                    dm.deleteRecord(username, password, id);
                    System.out.println("Menu item successfully deleted: ");
                    break;
                case 3:
                    System.out.println("Enter id of item to update: ");
                    id = sc.nextInt();
                    System.out.println("Enter new item name: ");
                    name = sc.nextLine();
                    System.out.println("Enter new item price: ");
                    price = sc.nextInt();
                    System.out.println("Enter new item description: ");
                    description = sc.nextLine();
                    System.out.println("Enter new item availability status (True or False): ");
                    status = sc.nextBoolean();
                    dm.updateRecord(username, password, id, name, price, description, status);
                    System.out.println("Menu item successfully updated: ");
                    break;
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

    }
    public static void createDatabase(String username, String password) {
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", username, password);
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
            System.out.print("Successfully created database and table for the menu.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertRecord(String username, String password, String name, int price, String description, Boolean status) {
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/",username, password);
             Statement stmt = conn.createStatement()) {

            // Insert values entered by user into the table
            String insertSql = "INSERT INTO menucard (name, price, description, status) "
                    + "VALUES ('" + name + "', '" + price + "', '" + description + "', " + status + ")";
            stmt.executeUpdate(insertSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteRecord(String username, String password, int id){
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/",username, password);
             Statement stmt = conn.createStatement()) {

            String DeleteSql = "DELETE FROM menucard WHERE id= " + id;
            stmt.executeUpdate(DeleteSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateRecord(String username, String password, int id, String name, int price, String description, Boolean status){
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/",username, password);
             Statement stmt = conn.createStatement()) {

            String UpdateSql = "UPDATE menucard SET "
                    + "name = " + name
                    + "price = " + price
                    + "description = " + description
                    + "status = " + status
                    + "WHERE id = " + id;

            stmt.executeUpdate(UpdateSql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
