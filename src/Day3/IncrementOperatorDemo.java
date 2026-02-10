package Day3;

public class IncrementOperatorDemo {
    public static void main(String[] args) {
        // 4) Increment & Decrement Operators ++ --
        int a = 10;
        System.out.println("Value of a: " +a); //10
        //case 1:
        a = a + 1;
        System.out.println("After Normal way of Increment for a value: " + a);  //11

        //case 2 : Post increment Operator
        int PostIncrementOperatorResult = a++;
        System.out.println("PostIncrementOperatorResult Logic performed");
        System.out.println("value of PostIncrementOperatorResult: " +PostIncrementOperatorResult); //11
        System.out.println("value of a after PostIncrement: " +a);   //12

        //case 3 : Pre increment Operator
        int PreIncrementOperatorResult = ++a;
        System.out.println("PreIncrementOperatorResult Logic performed");
        System.out.println("value of PreIncrementOperatorResult: " +PreIncrementOperatorResult);  //13
        System.out.println("value of a after PreIncrement: " +a);   //13
    }
}