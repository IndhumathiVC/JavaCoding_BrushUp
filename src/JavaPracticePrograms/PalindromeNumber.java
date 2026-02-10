package JavaPracticePrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input number: ");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("reversed number: " +rev);
        if(org_num == rev){
            System.out.println("Input Number : " +org_num+ " is a Palindrome Number" );
        }
        else {
            System.out.println("Input Number : " +org_num+ " is not a Palindrome Number" );
        }
    }
}
