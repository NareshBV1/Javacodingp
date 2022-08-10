package Exceptions.customException;

public class voteapp{
    public static void main(String args[]){
        try{
            throw new InvalidAgeException("Invalid Age");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }

}
