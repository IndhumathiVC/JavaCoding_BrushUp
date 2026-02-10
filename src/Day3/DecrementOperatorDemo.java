package Day3;

public class DecrementOperatorDemo {
    public static void main(String [] args){
        // 4) Increment & Decrement Operators ++ --
        int a = 10;
        System.out.println(a); //10
        //case 1:
        a = a-1;
        System.out.println(a); //9

        //case 2: PostDecrement
        a = 100;
        int PostDecrementResult = a--;
        System.out.println(PostDecrementResult); //100
        System.out.println(a); //99

        //case 3: PreDecrement
        a = 100;
        int PreDecrementResult = --a;
        System.out.println(PreDecrementResult); //99
        System.out.println(a); //99

    }
}
