package JavaPracticePrograms;

public class SecondLargestValueInAnArray {
    public static void main(String [] args){
        int a [] = {1,2,3,0,4,0,6,8,0,7};
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i =1; i<a.length; i++){
            if(a[i]>max){
                secondMax = max;
                max = a[i];
            }
            else if(a[i]>secondMax && a[i]!=max){
                secondMax = a[i];
            }
        }
        System.out.println("First Largest/Maximum value is: " +max);
        System.out.println("Second Largest/Maximum value is: " +secondMax);
    }
}
