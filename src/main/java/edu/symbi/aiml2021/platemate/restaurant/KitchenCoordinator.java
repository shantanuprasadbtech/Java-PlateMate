package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IKitchenCoordinator;

public class KitchenCoordinator extends Employee  implements IKitchenCoordinator {
    private boolean Available;
    public KitchenCoordinator(String name){
        super(name, "Chef" );
    }

    @Override
    public void receiveAndPrepareOrder(Order order, Waiter waiter) {
        System.out.println("Chef " + getName() + " received order for table no. " + order.getTableNo());
        System.out.println("Order for table no. " + order.getTableNo() + " is: ");
        order.showOrder();
        System.out.println("Chef " + getName() + " is preparing order for table no. " + order.getTableNo());
        System.out.println("Chef " + getName() + " has prepared order for table no. " + order.getTableNo());
        System.out.println("Chef " + getName() + " has completed preparing the order for table no. " + order.getTableNo());
        //waiter.serverOrder(order);
    }

}