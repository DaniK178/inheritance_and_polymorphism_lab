package Craft;

import Interface.IUsingNails;

public class MetalWork extends FunctionalWork implements IUsingNails {

    private String metalType;


    public MetalWork (String name, double timeToMake, String material, String metalType) {
        super(name, timeToMake, material);
        this.metalType = metalType;
    }

    public String nails (int numberOfNails){
        return String.format("This metal type, %s, would require %d nails",this.metalType, numberOfNails);
    }

}
