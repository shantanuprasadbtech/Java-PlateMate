package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IKitchenCoordinator;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.ITableManager;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IWaiter;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;


public class Order {
    private static int uniqueId;
    private final IKitchenCoordinator kitchenCoordinator;
    private final ITableManager tableManager;

    private OrderDetail orderDetail;

    private IWaiter waiter;


    public Order(int tableId, Waiter waiter, IKitchenCoordinator kitchenCoordinator, ITableManager tableManager) {
        uniqueId++;
        this.orderDetail = new OrderDetail(uniqueId, tableId);
        this.waiter = waiter;
        this.kitchenCoordinator = kitchenCoordinator;
        this.tableManager = tableManager;

    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public int getId() {
        return this.orderDetail.getId();
    }


    public int getTableNo() {
        return this.orderDetail.getTableNo();
    }

    public synchronized void updateOrder(int menuId, int quantity) {
        // The menu ID is starting with 1 whereas java list has members starting with 0
        MenuItem menuItem = waiter.showMenuCard().get(menuId-1);
        if(orderDetail.getOrderItems().containsKey(menuItem) ) {
            orderDetail.getOrderItems().put(menuItem, orderDetail.getOrderItems().get(menuItem) + quantity);
        } else {
            orderDetail.getOrderItems().put(menuItem, quantity);
        }

    }
//Order
    public void placeOrder() {
        this.orderDetail.setStatus("Order placed");
        kitchenCoordinator.receiveAndPrepareOrder(this);

    }

    public IWaiter getWaiter() {
        return waiter;
    }
}
