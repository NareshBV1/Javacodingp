package HasARelationshipOrAssociation.Composition;

public class Heart {
    String  heartrate;
    int vessels;
    public Heart(String heartrate,int vessels){
        this.heartrate=heartrate;
        this.vessels = vessels;
    }

    public void m1(){
        System.out.println("Method M1");
    }

    public void m2(){
        System.out.println("Method M2");
    }

}
