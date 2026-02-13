package JavaPracticePrograms;

import java.util.Arrays;

public class BubbleSortingAnArray {
    public static void main(String [] args){
        int a [] = {1,4,5,6,30,2,3};
        System.out.println("After Sorting: " + Arrays.toString(a));
        for(int i = 0; i<a.length-1; i++){
            for(int j =0; j<a.length-1; j++){
                if(a[j] >a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
