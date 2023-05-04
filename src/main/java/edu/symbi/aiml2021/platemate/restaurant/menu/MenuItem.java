package edu.symbi.aiml2021.platemate.restaurant.menu;

import java.util.Objects;

public class MenuItem {
    private int id;
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    public MenuItem(int id, String itemName, String itemDescription, double itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem menuItem)) return false;
        return id == menuItem.id && Double.compare(menuItem.itemPrice, itemPrice) == 0 && Objects.equals(itemName, menuItem.itemName) && Objects.equals(itemDescription, menuItem.itemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemName, itemDescription, itemPrice);
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

    public int getId() {
        return id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
//MenuItem