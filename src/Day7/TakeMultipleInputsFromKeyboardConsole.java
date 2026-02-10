package Day7;

import java.util.Scanner;

public class TakeMultipleInputsFromKeyboardConsole {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firstNumber: ");
        int n1 = sc.nextInt();

        System.out.println("Enter SecondNumber: ");
        int n2 = sc.nextInt();

        System.out.println("AdditionOperation: " +(n1+n2));

        System.out.println("Enter Age: ");
        int Age = sc.nextInt();
        System.out.println("Given Age value is: " +Age);


        System.out.println("Enter Name: ");
        sc.nextLine();
        String Name = sc.nextLine();
        System.out.println("Given Name value is: " +Name);

        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("Given price value is: " +price);

        System.out.println("Enter status: ");
        boolean status = sc.nextBoolean();
        System.out.println("Given status value is: " +status);

        System.out.println("Enter Value: ");
        Object value = sc.next();
        System.out.println("Given value is: " +value);


    }
}
