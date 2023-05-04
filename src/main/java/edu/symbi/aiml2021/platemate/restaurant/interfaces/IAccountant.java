package edu.symbi.aiml2021.platemate.restaurant.interfaces;

import edu.symbi.aiml2021.platemate.restaurant.Check;
import edu.symbi.aiml2021.platemate.restaurant.OrderDetail;

public interface IAccountant extends IEmployee {

    Check prepareCheck(OrderDetail orderDetail);
}