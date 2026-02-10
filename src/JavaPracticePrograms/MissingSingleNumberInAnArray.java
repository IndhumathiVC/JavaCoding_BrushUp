package JavaPracticePrograms;

public class MissingSingleNumberInAnArray {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,7,8,9,10};
        int sum1 =0, sum2 =0;
        for(int i =0; i<a.length; i++){
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of given Array of ELements: " + sum1);
        for(int i = 1 ; i<=10; i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range of ELements in an Array: " + sum2);
        System.out.println("Missing Number is: " +(sum2- sum1));
    }
}
