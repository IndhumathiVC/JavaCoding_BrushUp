package Day3;

public class SwappingBetweenTwoNumbers {
    public static void main(String [] args){
        // Temporary variable approach
        int a = 20, b = 10, c;
        System.out.println("Before Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);

        //Arithmetic Approach
        a= 500;
        b =200;
        System.out.println("Before Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);


        //Using XOR (Bitwise Operator)
        a = 700;
        b = 300;
        System.out.println("Before Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swapping of a and b---> the a Value is: " +a + " And b Value is: " +b);

    }
}
