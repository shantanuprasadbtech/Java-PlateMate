package edu.symbi.aiml2021.platemate.restaurant;

public class Check {
    private static int checkId;
    private OrderDetail orderDetail;
    private int id;
    private double total;

    public Check(OrderDetail orderDetail) {
        checkId++;
        this.orderDetail = orderDetail;
        this.id = checkId;
        this.total = orderDetail.getTotal();
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public int getId() {
        return id;
    }
//This is a getter to return value of total
    public double getTotal() {
        return total;
    }
}
