package Day4;

public class LargestOf2NumbersUsingTernaryOperator {
    public static void main(String [] args){
        int a = 500, b = 1000;
        int largestNumber = (a>b)? a : b;
        System.out.println("Largest number among a and b is: " + largestNumber);
    }
}
