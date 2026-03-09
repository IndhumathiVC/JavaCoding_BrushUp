package JavaPracticePrograms;

import java.util.Arrays;

public class KthLargestAndKthSmallest {
    public static void main(String[] args){
        int a [] = {8,2,4,3, 5, 6, 7, 9};
        int k = 3;

        for(int i=0; i<a.length-1; i++){
            for(int j= 0; j<a.length-1; j++){
              if(a[j] > a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
              }
            }
        }
        System.out.println(Arrays.toString(a));

        int kthSmallest = a[k-1];
        int kthLargest = a[a.length-k];

        System.out.println(kthSmallest);
        System.out.println(kthLargest);
    }
}
