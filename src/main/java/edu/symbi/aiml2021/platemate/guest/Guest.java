package edu.symbi.aiml2021.platemate.guest;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IPerson;

public class Guest implements IPerson {
    private static int id;
    private String name;
    private String contact;
    private int accompanyingGuests;
    private int assignedTableNo;

    public Guest(String name, String contact, int accompanyingGuests) {
        this.id++;
        this.name = name;
        this.contact = contact;
        this.accompanyingGuests = accompanyingGuests;

    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public int getAccompanyingGuests() {
        return accompanyingGuests;
    }

    public int getAssignedTableNo() {

        return assignedTableNo;
    }

    public void setAssignedTableNo(int assignedTableNo) {
        this.assignedTableNo = assignedTableNo;
    }
}
