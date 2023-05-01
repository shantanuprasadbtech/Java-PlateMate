package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.HashMap;
import java.util.Map;

public class OrderDetail {
    private int tableNo;
    private Map<MenuItem, Integer> orderItems;

    private String status;

    private int id;
    public OrderDetail(int id, int tableNo) {
        this.tableNo = tableNo;
        this.id = id;
        this.orderItems = new HashMap<>();
        this.status = "Ordering in progress";
    }

    public int getTableNo() {
        return tableNo;
    }

    public Map<MenuItem, Integer> getOrderItems() {
        return orderItems;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // only Check will call the following method
    double getTotal() {
        return orderItems.entrySet().stream().mapToDouble(e -> e.getKey().getItemPrice() * e.getValue()).sum();
    }
}
