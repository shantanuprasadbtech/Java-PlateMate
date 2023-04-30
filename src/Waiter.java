public class Waiter extends Employee{
    private double tips;
    private double totalBill;
    public Waiter(String name, String JobTitle, double time, double tips, double totalBill){
        super(name, JobTitle, time);
        this.tips = tips;
        this.totalBill=totalBill;
    }
    //Adding methods for waiter to take order from customer, deliver food to customer and receive payment from the customer
//    public void takeOrder(Menu menu, List<Order> orders, String itemName) {
//        Order order = new Order(itemName, menu.getPrice(itemName));
//        orders.add(order);
//    }
    public void deliverFood(List<Order> orders, Chef chef) {
        for (Order order : orders) {
            chef.prepareFood(order.getItemName());
        }
    }
    public void takePayment(String customer, double totalBill, double tips) {
        customer.payBill(totalBill + tips);
    }
}