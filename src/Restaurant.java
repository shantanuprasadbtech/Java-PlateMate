public class Restaurant {
    public String name;
    public String address;
    public String contact;
    public int numberOfTables;

    public Restaurant(String name, String address, String contact, int numberOfTables){
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.numberOfTables = numberOfTables;
    }
    public String getRestaurantName(){
        return "LittleItaly";
    }
    public String getAddress(){
        return "Balewadi High Street, Pune";
    }
    public String getContact(){
        return "020-12345678";
    }
    public int getNumberOfTables(){
        return 10;
    }
}
