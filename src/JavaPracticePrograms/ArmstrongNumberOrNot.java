package JavaPracticePrograms;

import java.util.*;

public class ArmstrongNumberOrNot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(), orgNum = num,  result =0, count =0;
        while(num!=0){
            num = num/10;
            count ++;
        }
        System.out.println("Number of digits count in the given Number: " +count);
        num = orgNum;
        while(num!=0){
            int digit = num%10;
            result += Math.pow(digit, count);
            num = num/10;
        }
        System.out.println(result);
        if(result == orgNum){
            System.out.println(result +" is Armstrong Number");
        }
        else{
            System.out.println(result +" is not an Armstrong Number");
        }
    }
}
