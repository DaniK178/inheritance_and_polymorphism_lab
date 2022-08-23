package Craft;

public class Pottery extends FunctionalWork {

    public String clayType;

    public Pottery (String name, double timeToMake, String material, String clayType){
        super(name, timeToMake, material);
        this.clayType = clayType;
    }

    @Override
    public String makeObject(){
        return "A pottery Object will be made";
    }

    public String makeObject(String objectType){
        if (objectType == "Bowls"){
            return "Yes we can make" + objectType + ", however, it will take longer";
        }
        else if (objectType == "Cutlery"){
            return  "Please specify the cutlery type and quantity in the form";
        }
        else
            return  "Yes we can make"+ objectType;

    }
    //if the parameter = bowl, say yes we can make it
    // if potter parament equals mug - ask hwo many
}
