public class User {
    private String name;
    private int contact;
    private int noOfGuests;

    public User(String name, int contact, int noOfGuests){
        this.name = name;
        this.contact = contact;
        this.noOfGuests = noOfGuests;
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
    public void setName(String name){
        this.name = name;
    }
    public void setContact(int contact){
        this.contact=contact;
    }
    public void setNoOfGuests(int noOfGuests){
        this.noOfGuests = noOfGuests;
    }
}