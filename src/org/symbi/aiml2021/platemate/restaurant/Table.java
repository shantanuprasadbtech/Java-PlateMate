package org.symbi.aiml2021.platemate.restaurant;

import java.util.Objects;

public class Table {
    private final int id;
    private final int capacity;
    private boolean available;

    public Table(int id, int capacity, boolean available) {
        this.id = id;
        this.capacity = capacity;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table table)) return false;
        return id == table.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}