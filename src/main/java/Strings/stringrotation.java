package Strings;

public class stringrotation {
    // Java Program to determine whether one string is a rotation of another

    public void rotationstring(String str1 ,String str2){
        if(str1.length()!=0  && str2.length()!=0){
            String str3 = str1.concat(str2);
            if(str3.contains(str2)){
                System.out.println("str2 is rotation of  str1");
            }else{
                System.out.println("str2 is not rotation of  str1");
            }
        }
    }


    public  static void main(String args[]){
        stringrotation n = new stringrotation();
        n.rotationstring("abcde","deabc1");
    }
}


