package JavaPracticePrograms;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String [] args) {
       int arr[] = {1,2,3,4,5};
       int len = arr.length;
       int rev[] = new int[len];
       int j = 0;
        System.out.println("Input Array is: " +(Arrays.toString(arr)));
       for(int i = len-1;i>=0;i--){
           rev[j] = arr[i];
           j++;
       }
        System.out.println("Reversed Array is: " +(Arrays.toString(rev)));
    }
}
