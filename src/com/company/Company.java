package com.company;
import java.util.ArrayList;
public class Company
{
    private ArrayList<PowerPlant> plants; // Arraylist of all the current power plants owned
    private final String name; // Stores the name of the company

    private double totalDemand; // the amount of electricity currently demanded by the customer this month
    private double totalSupply; // the amount of electricity we can generate this month.
    private double proportion; // the proportion of what is demanded vs. what is supplied.
    public Company(String name)
    {
        this.name = name;
        this.plants = new ArrayList<>();
    }
    public void addPlant(double[] location, double production)
    {
        PowerPlant plant = new PowerPlant(location, production);
        plants.add(plant);
    }
    public void addCustomer()
    {
    }
    public String getName()
    {
        return name;
    }

}
