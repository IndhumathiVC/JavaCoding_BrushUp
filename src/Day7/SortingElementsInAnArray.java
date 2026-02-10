package Day7;

import java.util.Arrays;

public class SortingElementsInAnArray {
    public static void main(String [] args){
        int a[] = {9, 7, 1, 8,2,6,4,5,3,1,8};
        System.out.println("Before Sorting: " +Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting: " +Arrays.toString(a));
    }
}
