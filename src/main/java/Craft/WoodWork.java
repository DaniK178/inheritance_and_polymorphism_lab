package Craft;

public class WoodWork extends FunctionalWork {

    private String woodMaterial;
    private String sawType;

    public WoodWork(String name, double timeToMake, String material, String woodMaterial, String sawType){

        super(name, timeToMake, material);
        this.woodMaterial = woodMaterial;
        this.sawType = sawType;
    }

    public String nails (int numberOfNails){
        return String.format("This wood type %s, would require %o of nails",this.woodMaterial, numberOfNails);
    }

}
