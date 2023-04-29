import java.util.*;

public class UserInfo {
    public void AddUser() {
        DatabaseManager sql = new DatabaseManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your contact information: ");
        int contact = sc.nextInt();

        System.out.println("Enter the number of guests: ");
        int noOfGuests = sc.nextInt();

        System.out.println("Enter the table number: ");
        int tableNo = sc.nextInt();

        sql.InsertRecord(name, contact, noOfGuests, tableNo);
        System.out.println("User added successfully: " + name);

    }
}
