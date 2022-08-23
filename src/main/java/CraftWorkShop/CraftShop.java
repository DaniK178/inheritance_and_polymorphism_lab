package CraftWorkShop;

import Craft.FunctionalWork;

import java.util.ArrayList;

public class CraftShop {

    private String name;

    public ArrayList<FunctionalWork> functionalWork;


    public CraftShop(String name){
        this.name = name;
        this.functionalWork = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
