package edu.symbi.aiml2021.platemate.restaurant.interfaces;

import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;

import java.util.List;

public interface IWaiter extends  IEmployee{

    List<MenuItem> showMenuCard();
}
