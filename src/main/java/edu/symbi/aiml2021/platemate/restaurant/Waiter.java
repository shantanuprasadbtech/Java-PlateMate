package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IKitchenCoordinator;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IMenuCard;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.ITableManager;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IWaiter;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.List;

public class Waiter extends Employee implements IWaiter {
    IMenuCard menuCard;
    IKitchenCoordinator kitchenCoordinator;

    ITableManager tableManager;


    public Waiter(String name, IMenuCard menuCard, IKitchenCoordinator kitchenCoordinator, ITableManager tableManager) {
        super(name, "Waiter");
        this.menuCard = menuCard;
        this.kitchenCoordinator = kitchenCoordinator;
        this.tableManager = tableManager;
    }


    @Override
    public List<MenuItem> showMenuCard() {
        return menuCard.getMenuItems();
    }
}

