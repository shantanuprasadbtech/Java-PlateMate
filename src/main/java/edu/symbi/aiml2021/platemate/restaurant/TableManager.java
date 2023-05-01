package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.interfaces.ITableManager;

import java.util.HashMap;
import java.util.Map;

public class TableManager implements ITableManager {
    Map<Table, Guest> tableGuestMap;
    private int numberOfTables;

    public TableManager(int numberOfTables) {
        tableGuestMap = new HashMap<>();
        for (int i = 1; i <= numberOfTables; i++) {
            Table table = new Table(i, 2 * i, true);
            tableGuestMap.put(table, null);
        }

    }

    @Override
    public int getNoOfTables() {
        return numberOfTables;
    }

    @Override
    public int assignTable(Guest guest) {
        for (Map.Entry<Table, Guest> entry : tableGuestMap.entrySet()) {
            if (entry.getKey().isAvailable() && entry.getKey().getCapacity() >= guest.getAccompanyingGuests()) {
                entry.getKey().setAvailable(false);
                entry.setValue(guest);
                guest.setAssignedTableNo(entry.getKey().getId());
                return entry.getKey().getId();
            }
        }
        return -1;
    }

    @Override
    public void freeTable(int tableNo) {
        for (Map.Entry<Table, Guest> entry : tableGuestMap.entrySet()) {
            if (entry.getKey().getId() == tableNo) {
                entry.getKey().setAvailable(true);
                entry.setValue(null);
            }
        }
    }

    @Override
    public Guest getGuestForTable(int tableNo) {
        for (Map.Entry<Table, Guest> entry : tableGuestMap.entrySet()) {
            if (entry.getKey().getId() == tableNo) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Map<Table, Guest> getTableStatus() {
        return tableGuestMap;
    }

}
