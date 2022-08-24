package Craft;

import java.util.ArrayList;

public abstract class Craft {

    protected String name;

    protected double timeToMake;



    public Craft(String name, double timeToMake){
        this.name = name;
        this.timeToMake = timeToMake;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(double timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String makeObject(){
        return String.format("I will make a %s craft object", this.name);

    }
}

