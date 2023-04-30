package org.symbi.aiml2021.platemate;

public class Restaurant {
    public String restname;
    public String restaddress;
    public String restcontact;
    public int numberOfTables;

    public Restaurant(String restname, String restaddress, String restcontact, int numberOfTables){
        this.restname = restname;
        this.restaddress = restaddress;
        this.restcontact = restcontact;
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
