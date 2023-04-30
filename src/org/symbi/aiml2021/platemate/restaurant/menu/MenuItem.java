package org.symbi.aiml2021.platemate.restaurant.menu;

public class MenuItem {
    private int id;
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public MenuItem(String itemName, String itemDescription, double itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
