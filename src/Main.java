//import java.util.List;
//import java.util.Scanner;
//
//public class RestaurantManagementSystem {
//    public static void main(String[] args) {
//        Database.connect();
//
//        // Display restaurant information
//        System.out.println("org.symbi.aiml2021.platemate.restaurant.Restaurant Information:");
//        System.out.println("----------------------");
//        System.out.println(Database.getRestaurantInfo());
//        System.out.println();
//
//        // Display table information
//        System.out.println("org.symbi.aiml2021.platemate.restaurant.Table Information:");
//        System.out.println("------------------");
//        List<org.symbi.aiml2021.platemate.restaurant.Table> tables = Database.getTableInfo();
//        for (org.symbi.aiml2021.platemate.restaurant.Table table : tables) {
//            System.out.println("org.symbi.aiml2021.platemate.restaurant.Table " + table.getNumber() + ": " + (table.isAvailable() ? "Available" : "Occupied"));
//        }
//        System.out.println();
//
//        // Display chef information
//        System.out.println("org.symbi.aiml2021.platemate.restaurant.Chef Information:");
//        System.out.println("-----------------");
//        List<org.symbi.aiml2021.platemate.restaurant.Chef> chefs = Database.getChefInfo();
//        for (org.symbi.aiml2021.platemate.restaurant.Chef chef : chefs) {
//            System.out.println(chef.getName() + ": " + (chef.isAvailable() ? "Available" : "Occupied"));
//        }
//        System.out.println();
//
//        // Display waiter information
//        System.out.println("org.symbi.aiml2021.platemate.restaurant.Waiter Information:");
//        System.out.println("-------------------");
//        List<org.symbi.aiml2021.platemate.restaurant.Waiter> waiters = Database.getWaiterInfo();
//        for (org.symbi.aiml2021.platemate.restaurant.Waiter waiter : waiters) {
//            System.out.println(waiter.getName() + ": " + (waiter.isAvailable() ? "Available" : "Occupied"));
//        }
//        System.out.println();
//
//        // Display menu
//        System.out.println("Menu:");
//        System.out.println("-----");
//        List<String> menuItemNames = Database.getMenuItemNames();
//        for (String menuItemName : menuItemNames) {
//            MenuItem menuItem = Database.getMenuItem(menuItemName);
//            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
//        }
//        System.out.println();
//
//        // Take order from customer
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter customer ID:");
//        int customerId = scanner.nextInt();
//        System.out.println("Please enter table number:");
//        int tableNumber = scanner.nextInt();
//        System.out.println("Please enter waiter name:");
//        String waiterName = scanner.next();
//        System.out.println("Please enter item name:");
//        String itemName = scanner.next();
//        System.out.println("Please enter quantity:");
//        int quantity = scanner.nextInt();
//
//        // Check if table is available
//        org.symbi.aiml2021.platemate.restaurant.Table table = Database.getTable(tableNumber);
//        if (!table.isAvailable()) {
//            System.out.println("org.symbi.aiml2021.platemate.restaurant.Table " + tableNumber + " is already occupied");
//            return;
//        }
//
//        // Check if waiter is available
//        org.symbi.aiml2021.platemate.restaurant.Waiter waiter = Database.getWaiter(waiterName);
//        if (!waiter.isAvailable()) {
//            System.out.println(waiterName + " is already serving another table");
//            return;
//        }
//
//        // Check if item is available
//        MenuItem menuItem = Database.getMenuItem(itemName);
//        if (menuItem == null) {
//            System.out.println(itemName + " is not available in the menu");
//            return;
//        }
//
//        // Calculate order price
//        double orderPrice = menuItem.getPrice() * quantity;
//
//        // Place order
//        Order order = new Order(itemName, orderPrice);
//        Database.placeOrder(customerId, tableNumber, waiterName, order);
//
//        // Update table availability
//        Database.updateTableAvailability(tableNumber, false);
//
//        // Update waiter availability
//        Database.updateWaiterAvailability(waiterName, false);
//
//        // Update customer bill
//        double customerBill = Database.getCustomerBill(customerId);
//        double newCustomerBill = customerBill + orderPrice;
//        Database.updateCustomerBill(customerId, newCustomerBill);
//
//        System.out.println("Order placed successfully");
//
//        scanner.close();
//        Database.disconnect();
//
//        // org.symbi.aiml2021.platemate.restaurant.Chef starts cooking order
//        List<Order> orders = Database.getOrders();
//        for (Order currentOrder : orders) {
//            String currentChefName = currentOrder.getChefName();
//            org.symbi.aiml2021.platemate.restaurant.Chef currentChef = Database.getChef(currentChefName);
//            if (currentChef.isAvailable()) {
//                currentChef.startCooking(currentOrder);
//                Database.updateChefAvailability(currentChefName, false);
//                break;
//            }
//        }
//
//        // org.symbi.aiml2021.platemate.restaurant.Waiter serves order to customer
//        orders = Database.getOrders();
//        for (Order currentOrder : orders) {
//            String currentWaiterName = currentOrder.getWaiterName();
//            org.symbi.aiml2021.platemate.restaurant.Waiter currentWaiter = Database.getWaiter(currentWaiterName);
//            if (!currentWaiter.isAvailable()) {
//                currentWaiter.serveOrder(currentOrder);
//                Database.updateWaiterAvailability(currentWaiterName, true);
//                break;
//            }
//        }
//
//        // Customer pays bill and tips waiter
//        System.out.println("Please enter customer ID to pay bill:");
//        customerId = scanner.nextInt();
//        double customerBillToPay = Database.getCustomerBill(customerId);
//        System.out.println("Customer bill is: $" + customerBillToPay);
//        System.out.println("Please enter amount paid by customer:");
//        double amountPaid = scanner.nextDouble();
//        double change = amountPaid - customerBillToPay;
//        System.out.println("Change is: $" + change);
//        System.out.println("Please enter tip amount:");
//        double tipAmount = scanner.nextDouble();
//        org.symbi.aiml2021.platemate.restaurant.Waiter currentWaiter = Database.getWaiter(Database.getOrder(customerId).getWaiterName());
//        currentWaiter.receiveTip(tipAmount);
//        System.out.println("Tip received by waiter " + currentWaiter.getName() + ": $" + tipAmount);
//        System.out.println("Thank you for visiting our restaurant");
//
//        scanner.close();
//        Database.disconnect();
//    }
//}