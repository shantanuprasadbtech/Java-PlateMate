public class Waiter extends Employee{
    private double tips;
    public Waiter(String name, String JobTitle, double time, double tips){
        super(name, JobTitle, time);
        this.tips = tips;

    }
}
