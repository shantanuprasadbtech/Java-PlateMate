package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IKitchenCoordinator;

import static java.lang.Thread.sleep;

public class KitchenCoordinator extends Employee  implements IKitchenCoordinator {
    private boolean Available;
    public KitchenCoordinator(String name){
        super(name, "Chef" );
    }

    @Override
    public void receiveAndPrepareOrder(Order order) {
        order.getOrderDetail().setStatus("Pending with Kitchen");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        order.getOrderDetail().setStatus("Preparing");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        order.getOrderDetail().setStatus("Ready for Serving");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        order.getOrderDetail().setStatus("Served to Customer by Waiter " + order.getWaiter().getName());



    }

}