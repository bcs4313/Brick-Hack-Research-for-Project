package com.company;
import java.util.ArrayList;
public class Customer
{

    private double[] location; // x-y mapping of the customer
    private double currentDemand; // the current consumption for this exact month


    public Customer(double[] location, String status, double currentDemand)
    {
        this.location = location;
        this.status = status;
        this.currentDemand = currentDemand;
    }
    /*
     This status variable tells us what is currently going on with the customer
     "Connected" -- no intervention needed, operating normally
     "Slate" -- has not installed our service yet, needs an initial charge to get service.
     */
    private String status;

    /*
    This array stores every single bill that has been given along with the date
    it is due. Bills past their due date are charged by the company's interest rate
     */
    private double[][] bills;

    public void chargeOptimalFactory(ArrayList<PowerPlant> plants)
    {

    }
}
