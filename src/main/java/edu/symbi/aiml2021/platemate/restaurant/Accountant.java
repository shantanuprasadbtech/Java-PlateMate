package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IAccountant;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IEmployee;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.IPerson;

public class Accountant extends  Employee implements IAccountant {

    public Accountant( String name) {
        super(name, "Accountant");
    }


    @Override
    public Check prepareCheck(OrderDetail orderDetail) {
        return new Check(orderDetail);
    }
}
