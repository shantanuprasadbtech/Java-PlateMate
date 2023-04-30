package org.symbi.aiml2021.platemate.restaurant;

import org.symbi.aiml2021.platemate.general.Person;

import java.util.*;
public abstract class Employee implements Person {
    private static int id;
    private String name;
    private String JobTitle;


    public Employee(String name, String JobTitle){
        this.id++;
        this.name = name;
        this.JobTitle = JobTitle;

    }

    public String getName(){

        return name;
    }

    public String getJobTitle(){

        return JobTitle;
    }

    public static int getId() {
        return id;
    }
}
