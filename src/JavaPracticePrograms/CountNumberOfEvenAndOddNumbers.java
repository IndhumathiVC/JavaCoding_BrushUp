package JavaPracticePrograms;

import java.util.*;
public class CountNumberOfEvenAndOddNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Input Number: ");
        int num = sc.nextInt(); //3456
        int evenCount = 0;
        int oddCount = 0;
        int count = 0;
        while(num!=0){
           int digit = num % 10;
           if(digit % 2 ==0){
               evenCount++;
           }
           else{
               oddCount++;
           }
           num = num/10;
            count++;
        }
        System.out.println("TotalCount of digits in InputNumber: " + count);
        System.out.println("Total number of EvenNumbers in Given InputNumber: " +evenCount);
        System.out.println("Total number of OddNumbers in Given InputNumber: " +oddCount);
    }
}
