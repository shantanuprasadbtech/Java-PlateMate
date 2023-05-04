package edu.symbi.aiml2021.platemate.restaurant.interfaces;

import edu.symbi.aiml2021.platemate.restaurant.Order;
import edu.symbi.aiml2021.platemate.restaurant.Waiter;

public interface IKitchenCoordinator {
    void receiveAndPrepareOrder(Order order);

}
