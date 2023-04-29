public class Chef extends Employee{
    private boolean Available;
    public Chef(String name, String JobTitle, double time, boolean Available){
        super(name, JobTitle, time);
        this.Available = Available;

    }
}
