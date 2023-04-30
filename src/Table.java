public class Table {
    private final int number;
    private int capacity;
    private boolean available;

    public Table(int number, int capacity, boolean available) {
        this.number = number;
        this.capacity = capacity;
        this.available = available;
    }

    public int getNumber() {
        return number;
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
}