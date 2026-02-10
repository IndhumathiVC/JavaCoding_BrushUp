package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputsFromConsoleToAddIntoAnArray {

        public static void main(String[] args){
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter the value in Position " +i+ " is: ");
            a[i] =sc.nextInt();
        }
            System.out.println("Printing the array: " + Arrays.toString(a));
    }

}
