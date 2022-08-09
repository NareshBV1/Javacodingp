package Encapsulation;

//  The process of binding data and the corresponding methods as single unit is called encapsulation
//  If all the variables in a clas declared as  a private then that class is said to be tightly encapsulated class
public class Encapsulationexample {
    private String Name = "tt";

    public String getName(){
        return Name;
    }

    public String setName(){
        this.Name = "Naresh";
        return Name;
    }

}
