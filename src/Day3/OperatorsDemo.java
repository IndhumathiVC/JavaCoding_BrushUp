package Day3;

public class OperatorsDemo {
    public static void main (String [] args){

        //Six Different types of Operators
     // 1) Arithmetic Operators are + - * / %
     // 2) Relational/Comparison Operators are > >= <= < != ==   Always returns  boolean dataype value true/false as output --- Input variables can be comparison between any type of datatypes
     // 3) logical Operators are && ! ||  Always returns  boolean dataype value true/false as output      ----- Input variables can be only boolean datatype
     // 4) Increment & Decrement Operators ++ --
     // 5) Assignment Operators are = += -= *=  /= %=
     // 6) Conditional/Ternary Operators are ?:

        // 1) Arithmetic Operators are + - * / %
     int a = 20, b = 10;
     System.out.println("Value of a and b is: a = " + a + " b = " +b);
     System.out.println("Sum of a and b is:" +(a+b));
     System.out.println("Difference between a and b is:" +(a-b));
     System.out.println("Multiplication of a and b is:" +(a*b));
     System.out.println("Divison of a and b is:" +(a/b));
     System.out.println("Modulo Divison of a and b is:" +(a%b));

     // 2) Relational/Comparison Operators are > >= <= < != ==
     // Always returns  boolean dataype value true/false as output ---
        // Input variables can be comparison between any type of datatypes
       // a and b are already declared above as int data type
        System.out.println("Value of a and b is: a = " + a + " b = " +b);
        System.out.println(" Relational Comparison of a Greater than b is:" +(a>b)); //true
        System.out.println(" Relational Comparison of a Greater than and Equal to b is:" +(a>=b)); //true
        System.out.println(" Relational Comparison of a Less than b is:" +(a<b)); //false
        System.out.println(" Relational Comparison of a Less than and Equal to b is:" +(a<=b)); //false
        System.out.println(" Relational Comparison of a not equal to b is:" +(a!=b)); //true
        System.out.println(" Relational Comparison of a Equal to b is:" +(a==b)); //false;
        b=20;
        System.out.println(" b value is updated as: " +b);
        System.out.println(" Relational Comparison of a Equal to b is:" +(a==b)); //true;

     // 3) logical Operators are && ! ||  Always returns  boolean dataype value true/false as output
        // ----- Input variables can be only boolean datatype
       boolean x = true;
       boolean y = false;

       System.out.println("x and y values are: x = " + x + " y = " +y);
       System.out.println("x and y Logical Operation: " +(x&&y)); //false
       System.out.println("x or y Logical Operation: " +(x||y));   // true
       System.out.println("x Not Logical Operation: " +(!x));   //false
       System.out.println("y Not Logical Operation: " +(!y));   // true

        boolean b1 = 10>20;
        System.out.println(b1); //false
        boolean b2 = 10<20;
        System.out.println(b2); //true

        System.out.println(b1 || b2); // true
        System.out.println(b1 && b2); //false

        // relational operators and Logical operators combined validation
        System.out.println((1>2) && (1<2)); //false
        System.out.println((1>2) || (1<2)); //true


    }
}
