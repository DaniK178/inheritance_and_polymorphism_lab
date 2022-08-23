package Craft;

public abstract class FunctionalWork extends Craft {


    protected String material;

    public FunctionalWork(String name, double timeToMake, String material){

        super(name, timeToMake);
        this.material= material;

    }

    @Override
    public String makeObject(){
        return "I'm making a functional object";
    }



}

