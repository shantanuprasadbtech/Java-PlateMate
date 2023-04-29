import java.util.Scanner;

public class UserInfo {
    
    public static void main(String[] args){
        DatabaseManager sql = new DatabaseManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your contact information:");
        int contact = sc.nextInt();

        System.out.println("Enter the number of guests");
        int noOfGuests = sc.nextInt();

        sql.InsertRecord(name, contact, noOfGuests);
        System.out.println("User added successfully: " + name);

        String[] tableArray = new String[] {'Top Right', 'Middle Right', 'Bottom Right', 'Top Left', 'Middle Left', 'Bottom Left'}
        System.out.println("Please choose a table:");

        for (int i = 0; i < tableArray.length; i++) {
            System.out.println((i+1) + ". " + options[i]);
        }
        int choice = sc.nextInt();


        if (choice >= 1 && choice <= tableArray.length) {
            String selectedOption = tableArray[choice-1];
            System.out.println("You selected: " + selectedOption);
        } else {
            System.out.println("Invalid choice.");
        }

        User student = new Student(name, dob, prn);
        System.out.println("Student added successfully: " + student);

    }
}
