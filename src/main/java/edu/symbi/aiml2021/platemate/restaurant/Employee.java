package edu.symbi.aiml2021.platemate.restaurant;

import edu.symbi.aiml2021.platemate.restaurant.interfaces.IEmployee;


public abstract class Employee implements IEmployee {
    private static int uniqueId;
    private String name;
    private String JobTitle;

    private int id;
    public Employee(String name, String JobTitle){
        this.id = uniqueId;
        uniqueId++;
        this.name = name;
        this.JobTitle = JobTitle;

    }

    public String getName(){

        return name;
    }

    public String getJobTitle(){

        return JobTitle;
    }

    public int getId() {
        return id;
    }
}
