package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.guest.Guest;
import org.symbi.aiml2021.platemate.restaurant.menu.MenuCard;

public class Restaurant {
    private final Waiter waiter;
    private final Chef chef;
    public String restname;
    public String restaddress;
    public String restcontact;
    public int numberOfTables;

    private TableManager tableManager;

    private MenuCard menuCard;
    public Restaurant(String restname, String restaddress, String restcontact, int numberOfTables) {
        this.restname = restname;
        this.restaddress = restaddress;
        this.restcontact = restcontact;

        this.tableManager = new TableManager(numberOfTables);
        this.waiter = new Waiter("John");
        this.chef = new Chef("Jack");
        this.menuCard = new MenuCard();
        this.waiter.setMenuCard(this.menuCard);
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

    public Guest guestArrived(String name, String contact, int accompanyingGuests) {
        Guest guest = new Guest(name, contact, accompanyingGuests);
        return guest;
    }

    public int assignTable(Guest guest) {
        return tableManager.assignTable(guest);
    }

    public Waiter assignWaiter(int tableNo) {
        return waiter;
    }

    public MenuCard getMenuCard() {
        return this.menuCard;
    }
}