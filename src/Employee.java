import java.util.*;
public abstract class Employee {
    private String name;
    private String JobTitle;
    private double time; // in hours

    public Employee(String name, String JobTitle, double time){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = sc.nextLine();

        System.out.println("Enter job title");
        this.JobTitle = sc.nextLine();

        System.out.println("Enter time");
        this.time = sc.nextDouble();
    }

    public String getName(){

        return name;
    }

    public String getJobTitle(){

        return JobTitle;
    }

    public double getTime(){
        return time;
    }


}
