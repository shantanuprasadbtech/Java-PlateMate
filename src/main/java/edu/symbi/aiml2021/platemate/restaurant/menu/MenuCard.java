package edu.symbi.aiml2021.platemate.restaurant.menu;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IMenuCard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuCard implements IMenuCard {
    // load menu items from database and store them in this list
    private static final String QUERY = "SELECT id, name, price, description FROM platemate.menucard where status = 1";
    private List<MenuItem> menuItems;   // array of menu items

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    private void loadMenuItems() {
        // load menu items from database using jdbc
        // and store them in this.menuItems
        // load menu items from database using jdbc
        // and store them in this.menuItems
        menuItems = new ArrayList<MenuItem>();
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "system");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {

            while(rs.next()){
                //Display values

                MenuItem menuItem = new MenuItem(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"));
                menuItems.add(menuItem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public MenuCard() {
        loadMenuItems();

    }


    public List<MenuItem> showMenuCard() {
        return new ArrayList<>(menuItems);
    }
}
