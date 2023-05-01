package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.exceptions.NoTablesAvailableException;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IAccountant;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IWaiter;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuCard;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;
import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.ITableManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private final IAccountant accountant;
    private List<IWaiter> waiters;
    private final KitchenCoordinator kitchenCoordinator;
    public String restname;
    public String restaddress;
    public String restcontact;
    public int numberOfTables;

    private ITableManager tableManager;

    private Map<Integer, Order> orders;


    public Restaurant(String restname, String restaddress, String restcontact, int numberOfTables) {
        this.restname = restname;
        this.restaddress = restaddress;
        this.restcontact = restcontact;
        this.accountant = new Accountant("John");
        this.tableManager = new TableManager(numberOfTables);
        this.kitchenCoordinator = new KitchenCoordinator("Jack");

        this.waiters = new ArrayList<>();

        IWaiter waiter = new Waiter("Johnny", new MenuCard(), kitchenCoordinator, tableManager);
        this.waiters.add(waiter);
        this.orders = new HashMap<>();
    }

    public String getRestaurantName() {
        return "LittleItaly";
    }

    public String getAddress() {
        return "Balewadi High Street, Pune";
    }

    public String getContact() {
        return "020-12345678";
    }

    public int getNumberOfTables() {
        return tableManager.getNoOfTables();
    }

    public Guest guestArrived(String name, String contact, int accompanyingGuests) throws NoTablesAvailableException {
        Guest guest = new Guest(name, contact, accompanyingGuests);
        int tableAssigned = tableManager.assignTable(guest);
        if (tableAssigned == -1) {
            throw new NoTablesAvailableException("No tables available");
        }

        return guest;
    }

    public int assignTable(Guest guest) {
        return tableManager.assignTable(guest);
    }

    public Waiter assignWaiter(int tableNo) {
        return (Waiter) waiters.get(0);
    }
    public List<MenuItem> waiterShowsMenucard(int waiterId) {
        IWaiter waiter = getWaiterForId(waiterId);
        return waiter.showMenuCard();

    }
    private IWaiter getWaiterForId(int waiterId) {
        for (IWaiter waiter : this.waiters) {
            if(waiter.getId() == waiterId) {
                return waiter;
            }
        }
        return null;
    }

    public OrderDetail waiterCreatesOrderForTable(int waiterId, int tableId) {
        IWaiter waiter = getWaiterForId(waiterId);
        Order order = waiter.createOrder(tableId);
        orders.put(order.getId(), order);
        return order.getOrderDetail();
    }

    public OrderDetail waiterUpdatesOrder(int orderId, int menuId, int quantity) {
        Order order = orders.get(orderId);
        order.updateOrder(menuId, quantity);
        return order.getOrderDetail();
    }

    public OrderDetail waiterPlacesOrder(int orderId) {
        Order order = orders.get(orderId);
        order.placeOrder();
        return order.getOrderDetail();

    }

    public OrderDetail waiterChecksOrderStatus(int orderId) {
        Order order = orders.get(orderId);
        return order.getOrderDetail();
    }

    public Check waiterGetsACheck(int orderId) {
        Order order = orders.get(orderId);
        tableManager.freeTable(order.getTableNo());
        return accountant.prepareCheck(order.getOrderDetail());

    }

    public Map<Table, Guest> getTableStatus() {
        return tableManager.getTableStatus();
    }
}