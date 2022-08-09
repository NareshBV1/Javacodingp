package Strings;

import java.util.Arrays;

public class Sumofgivenintegers {
    //Sum of each 4 integers in a srring and find out the max sum
    public void maxsumofintegers(){
        int[] arr = new int[] {11,15,13,74,65,96,17,68};
        int k =3;
        int[] arr1 = new int[k*2];
        int temp = 0;
        int n = arr.length;
        for(int i=0;i < n-k+1;i++){
            int currentsum = 0;
            for(int j=i;j < k+i ;j++){
                currentsum = currentsum+ arr[j];

            }
            arr1[temp] =  currentsum;
            temp++;

        }
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length -1]);
    }

    public  static void main(String args[]){
        Sumofgivenintegers t = new Sumofgivenintegers();
        t.maxsumofintegers();

    }

}

