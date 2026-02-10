package Day4;

public class SmallestOf3Numbers {
    public static void main(String [] args){
        int a = 30, b = 50, c  = 90;
        if(a<b && a<c){
            System.out.println("a is the SmallestNumber: " +a);
        }
        else if(b<a && b<c){
            System.out.println("b is the SmallestNumber: " +b);
        }
        else{
            System.out.println("c is the SmallestNumber: " +c);
        }
    }
}
