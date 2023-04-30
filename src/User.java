public class User {
    private String name;
    private int contact;
    private int noOfGuests;

    private int tableNo;

    public User(String name, int contact, int noOfGuests, int tableNo){
        this.name = name;
        this.contact = contact;
        this.noOfGuests = noOfGuests;
        this.tableNo = tableNo;
    }

    public String getName(){  

        return name;
    }
    public int getContact(){
        return contact;
    }
    public int getNoOfGuests(){
        return noOfGuests;
    }
    public int tableNo(){
        return tableNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContact(int contact){
        this.contact=contact;
    }
    public void setNoOfGuests(int noOfGuests){
        this.noOfGuests = noOfGuests;
    }
    public void setTableNo(int tableNo){
        this.tableNo = tableNo;
    }
}