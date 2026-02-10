package Day4;

import java.util.Scanner;

public class ifConditionDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PersonAge:");
        int Person_Age = sc.nextInt();
        if(Person_Age>=18){
            System.out.println("Eligible for Voting");
        }
    }
}
