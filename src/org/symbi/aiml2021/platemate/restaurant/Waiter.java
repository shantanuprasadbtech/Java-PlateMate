package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.restaurant.Employee;
import org.symbi.aiml2021.platemate.restaurant.menu.MenuCard;

public class Waiter extends Employee{
    MenuCard menuCard;
    Chef chef;

    TableManager tableManager;

    public TableManager getTableManager() {
        return tableManager;
    }

    public void setTableManager(TableManager tableManager) {
        this.tableManager = tableManager;
    }

    void setChef(Chef chef) {
        this.chef = chef;
    }

    Waiter(String name){
        super(name, "Waiter");
    }

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public void showMenucard() {
        menuCard.showMenuCard();
    }

    public Order createOrder(int tableNo) {
        return new Order(tableNo);
    }

    public void repeatOrder(Order order) {
        System.out.println("Order for table no. " + order.getTableNo() + " is: ");
        order.showOrder();
    }

    public void placeOrder(Order order) {
        chef.receiveOrder(order, this);
    }

    public void serverOrder(Order order) {
        System.out.println("Order for table no. " + order.getTableNo() + " is served by the waiter " + getName()
                + " to the guest " + tableManager.getGuestForTable(order.getTableNo()).getName());

    }
}

