package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.guest.Guest;
import org.symbi.aiml2021.platemate.restaurant.Table;

import java.util.HashMap;
import java.util.Map;

public class TableManager {
    Map<Table, Guest> tableGuestMap;
    private int numberOfTables;

    public TableManager(int numberOfTables) {
        tableGuestMap = new HashMap<>();
        for(int i=1;i<=numberOfTables;i++) {
            Table table = new Table(i,2*i,true);
            tableGuestMap.put(table, null);
        }

    }
    public int getNoOfTables() {
        return numberOfTables;
    }

    public int assignTable(Guest guest) {
        for(Map.Entry<Table,Guest> entry : tableGuestMap.entrySet()) {
            if(entry.getKey().isAvailable() && entry.getKey().getCapacity() >= guest.getAccompanyingGuests())
                entry.getKey().setAvailable(false);
                entry.setValue(guest);
                guest.setAssignedTableNo(entry.getKey().getId());
                return entry.getKey().getId();
            }
            return -1;
        }

    public void freeTable(int tableNo) {
        for(Map.Entry<Table,Guest> entry : tableGuestMap.entrySet()) {
            if(entry.getKey().getId() == tableNo) {
                entry.getKey().setAvailable(true);
                entry.setValue(null);
            }
        }
    }

 public Guest getGuestForTable(int tableNo) {
        for(Map.Entry<Table,Guest> entry : tableGuestMap.entrySet()) {
            if(entry.getKey().getId() == tableNo) {
                return entry.getValue();
            }
        }
        return null;
    }

}
