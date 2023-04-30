package org.symbi.aiml2021.platemate.restaurant;

public class Chef extends Employee {
    private boolean Available;
    public Chef(String name){
        super(name, "Chef" );

    }

    public void receiveOrder(Order order, Waiter waiter) {
        System.out.println("Chef " + getName() + " received order for table no. " + order.getTableNo());
        System.out.println("Order for table no. " + order.getTableNo() + " is: ");
        order.showOrder();
        System.out.println("Chef " + getName() + " is preparing order for table no. " + order.getTableNo());
        System.out.println("Chef " + getName() + " has prepared order for table no. " + order.getTableNo());
        System.out.println("Chef " + getName() + " has completed preparing the order for table no. " + order.getTableNo());
        waiter.serverOrder(order);
    }

}