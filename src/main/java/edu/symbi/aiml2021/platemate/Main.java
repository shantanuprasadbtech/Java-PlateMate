package edu.symbi.aiml2021.platemate;

import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.Order;
import edu.symbi.aiml2021.platemate.restaurant.Restaurant;
import edu.symbi.aiml2021.platemate.restaurant.Waiter;
import edu.symbi.aiml2021.platemate.restaurant.exceptions.NoTablesAvailableException;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuCard;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.List;

public class Main {
    public static void main(String[] args) throws NoTablesAvailableException {
        Restaurant restaurant = new Restaurant("LittleItaly", "Balewadi High Street, Pune", "020-12345678", 5);
        Guest guest = restaurant.guestArrived("John", "9876543210", 3);
        int tableNo = restaurant.assignTable(guest);
        Waiter waiter = restaurant.assignWaiter(tableNo);
//        List<MenuItem> menuItems = restaurant.waiterShowsMenucard(waiterId);
//        for (MenuItem menuItem : menuItems) {
//            System.out.println(menuItem.toString());
//        }
//        Order order = restaurant.waiterCreateOrderForTable(waiterId, tableNo);
//        order = restaurant.waiterAddsItemToOrder(order.getId(), menuItems.get(1), 1);
//        order = restaurant.waiterAddsItemToOrder(order.getId(), menuItems.get(2), 2);
//        order = restaurant.waiterPlacesOrder(order);
//        order = restaurant.preparesFoodForOrder();
//        restaurant.waiterServesOrderToGuest(order);
//        Bill bill = restaurant.preparesBillForOrder(order);
//        restaurant.guestPaysBillAndExits(bill);

    }
}
