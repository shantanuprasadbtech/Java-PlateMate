package edu.symbi.aiml2021.platemate.restaurant.interfaces;

import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.Table;

import java.util.Map;

public interface ITableManager {
    int getNoOfTables();

    int assignTable(Guest guest);

    void freeTable(int tableNo);

    Guest getGuestForTable(int tableNo);

    Map<Table, Guest> getTableStatus();
}
