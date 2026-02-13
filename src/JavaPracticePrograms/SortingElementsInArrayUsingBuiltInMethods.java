package JavaPracticePrograms;

import java.util.*;

public class SortingElementsInArrayUsingBuiltInMethods {
    public static void main(String [] args){
        int [] a = {5,1,2,8,7,3,4,9,6};

        //AscendingOrder - Approach1
        /* System.out.println("Before Sorting: " +Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After Sorting: " +Arrays.toString(a));
         */


        //AscendingOrder - Approach2
        System.out.println("Before Sorting: " +Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting: " +Arrays.toString(a));


        Integer [] b = {7,5,2,8,1,4,3,9,6};
        //DescendingOrder
        System.out.println("Before Sorting: " +Arrays.toString(b));
        Arrays.sort(b,Collections.reverseOrder());
        System.out.println("After Sorting: " +Arrays.toString(b));

    }
}
