import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Table table;
    private ArrayList<MenuItem> menuItems;
    private String status;

    public Order(Table table) {
        this.table = table;
        this.menuItems = new ArrayList<MenuItem>();
        this.status = "open";
    }

    public Order(String itemName, Object price) {
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (MenuItem item : menuItems) {
            total += item.getTotalCost();
        }
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getItemName() {
        return null;
    }
}
