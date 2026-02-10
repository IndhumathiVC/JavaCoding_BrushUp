package Day7;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String [] args){
        int arr[] = {100,200,300,400,500};
        int len = arr.length;
        int revArr [] = new int[len];
        int j = 0;
        for(int i = len-1; i>=0; i--){
            revArr[j] = arr[i];
            j++;

        }
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(revArr));
    }
}
