package Day4;

import java.util.Scanner;

public class ifElseIfLadderConditionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(num + " is a Positive Number");
        }
        else if(num == 0){
            System.out.println(num + " is equal to Zero");
        }
        else{
            System.out.println(num + " is a Negative Number");
        }
    }
}
