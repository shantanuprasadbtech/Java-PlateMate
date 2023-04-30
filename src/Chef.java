public class Chef extends Employee{
    private boolean Available;
    public Chef(String name, String JobTitle, double time, boolean Available){
        super(name, JobTitle, time);
        this.Available = Available;

    }

    public void prepareFood(Object itemName) {
    }
}


//public class Chef {
//    private String name;
//    private boolean available;
//
//    public Chef(String name, boolean available) {
//        this.name = name;
//        this.available = available;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isAvailable() {
//        return available;
//    }
//
//    public void setAvailable(boolean available) {
//        this.available = available;
//    }
//
//    public void editMenu(Menu menu, String itemName, String newItemName) {
//        menu.editItem(itemName, newItemName);
//    }
//
//    public void deleteMenu(Menu menu, String itemName) {
//        menu.deleteItem(itemName);
//    }
//        public void prepareFood(Object itemName) {
//    }
//}