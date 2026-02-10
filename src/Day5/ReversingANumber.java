package Day5;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a InputNumber: ");
        int num = sc.nextInt();   //input 1234
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reversed Number: " +rev);
    }
}
