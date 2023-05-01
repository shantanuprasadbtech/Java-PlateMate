package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int uniqueId;
    private int tableNo;
    private Map<MenuItem, Integer> orderItems;

    private String status;

    private int id;
    public Order(int tableNo) {
        this.tableNo = tableNo;
        this.id = uniqueId;
        uniqueId++;
        this.orderItems = new HashMap<>();
    }
    public void addOrderItem(MenuItem menuItem, int quantity) {
        if(orderItems.containsKey(menuItem)) {
            orderItems.put(menuItem, orderItems.get(menuItem) + quantity);
            return;
        }
        orderItems.put(menuItem, quantity);
    }


    public int getTableNo() {
        return tableNo;
    }

    public void showOrder() {
        for(Map.Entry<MenuItem, Integer> entry : orderItems.entrySet()) {
            System.out.println("MenuItem :" + ((MenuItem)(entry.getKey())).getItemName() + " : Qty:" + entry.getValue());
        }
    }

    public int getId() {
        return id;
    }
}
