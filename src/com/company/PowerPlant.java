package com.company;

public class PowerPlant
{
    private double maxProduction; // maximum kV that the plant can produce
    private double production; // kV that the plant is producing currently
    private double[] location; // x, y location of the plant
    private String type; // the type of plant, either coal, natural gas, wind, solar, hydroelectric, nuclear
    private int flexibility; // the rate at which the plant can change the amount of power output

    public PowerPlant(double[] location, double maxProduction, String type)
    {
        this.location = location;
        this.maxProduction = maxProduction;
        this.type = type;

        if(type.equals("coal"))
        {
            flexibility = 1; // arbitrary values
        }
        else if(type.equals("natural gas"))
        {
            flexibility = 4;
        }
        else if(type.equals("wind"))
        {
            flexibility = 6;
        }
        else if(type.equals("solar"))
        {
            flexibility = 6;
        }
        else if(type.equals("hydroelectric"))
        {
            flexibility = 6;
        }
        else if(type.equals("nuclear"))
        {
            flexibility = 1;
        }
    }

    public double getProduction()
    {
        return production;
    }

    public double[] getLocation()
    {
        return location;
    }
}
