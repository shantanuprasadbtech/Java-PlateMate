package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int id;
    private int tableNo;
    private Map<MenuItem, Integer> orderItems;

    public Order(int tableNo) {
        this.tableNo = tableNo;
        this.id++;
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
}
