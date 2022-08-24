package CraftWorkShop;

import Craft.FunctionalWork;
import Interface.IUsingNails;

import java.util.ArrayList;

public class CraftShop {

    private String name;

    public ArrayList<FunctionalWork> functionalWork;
    public ArrayList<IUsingNails> iUsingNails;


    public CraftShop(String name){
        this.name = name;
        this.functionalWork = new ArrayList<>();
    }
    public void listFunctionalObjects() {
        for (FunctionalWork work : functionalWork) {
            System.out.println(work);
        }
    }
//    public void numberOfFunctionalWork(){
//    int sizeOfFunctionalWork = FunctionalWork.size();
//    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
