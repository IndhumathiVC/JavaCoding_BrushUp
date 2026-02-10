package JavaPracticePrograms;

public class MaxAndMinValueInAnArray {
    public static void main(String [] args){
        int [] a = {30,10,70,20,60,40,50};
        int max = a[0], min = a[0];
        for(int i =1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum Value in the given Array is: " +max);

        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Minimum Value in the given Array is: " +min);
    }
}
