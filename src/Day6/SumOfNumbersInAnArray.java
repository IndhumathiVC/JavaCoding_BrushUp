package Day6;

public class SumOfNumbersInAnArray {
    public static void main(String [] args){
        int arr[] = {1,2,3,4};
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of an Array: " +sum);

        // enhanced for loop or for-each loop
        int ar[] = { 5,6,7,8,9};
        int total = 0;
        for(int value: ar){
            total = total + value;
        }
        System.out.println("Sum of Array: " +total);
    }
}
