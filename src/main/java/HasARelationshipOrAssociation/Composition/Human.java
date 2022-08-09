package HasARelationshipOrAssociation.Composition;

public class Human {
    String name;
    int age;
    Heart h;

    public  Human(String name,int age,Heart h){
         this.name = name;
         this.age = age;
         this.h = h;
    }

    public  void m3(){
        System.out.println("Method M3");
    }

    public  void m4(){
        System.out.println("Method M4");
    }

}
