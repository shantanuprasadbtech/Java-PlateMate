package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.restaurant.Employee;
import org.symbi.aiml2021.platemate.restaurant.menu.MenuCard;

public class Waiter extends Employee{
    MenuCard menuCard;
    public Waiter(String name){
        super(name, "Waiter");
    }

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public void showMenucard() {
        menuCard.showMenuCard();
    }
}

