package org.symbi.aiml2021.platemate;

import org.symbi.aiml2021.platemate.guest.Guest;
import org.symbi.aiml2021.platemate.restaurant.Order;
import org.symbi.aiml2021.platemate.restaurant.Restaurant;
import org.symbi.aiml2021.platemate.restaurant.Waiter;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("LittleItaly", "Balewadi High Street, Pune", "020-12345678", 5);
        Guest guest = restaurant.guestArrived("John", "9876543210", 3);
        int tableNo = restaurant.assignTable(guest);
        Waiter waiter = restaurant.assignWaiter(tableNo);
        waiter.showMenucard();
        Order order = waiter.createOrder(tableNo);
        order.addOrderItem(restaurant.getMenuItem(1), 2);
        order.addOrderItem(restaurant.getMenuItem(2), 1);
        waiter.repeatOrder(order);


    }
}
