package Day6;

import java.util.Arrays;

public class SingleDimensionalArrayDemo {
    public static void main(String [] args){
        // Declare an array
        // Add values into an array
        // Find the size or length of an array
        // read the single value from an array
        // read the multiple value from an array

        // Declare an array
       /* int a[] = new int [5];
       // Add values into an array
           a[0] = 100;
           a[1] = 200;
           a[2] = 300;
           a[3] = 400;
           a[4] = 500;
           System.out.println(Arrays.toString(a));
        */

        // Find the length of Array
        /* int a[] = {10, 20, 30};
        int len = a.length;
        System.out.println(len);
         */

        //Read single value from an array
        /* int a[] = {10,20,30,40};
        System.out.println(a[3]);
         */

        // Read multiple value from an array Approach-1 : Using for loop
       /*  int a[] = {10,20,30,40,50};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        */

        // Read multiple value from an array Approach-1 : Using for-eachloop /Enhanced for loop
       int a[] = {1,2,3};
        for( int x: a){
            System.out.println(x);
        }
    }
}
