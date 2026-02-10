package Day4;

import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args){
       int a = 300, b = 200, c = 50;
        if(a>b && a>c){
            System.out.println(a + " is the largest Number");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest Number");
        }
        else{
            System.out.println(c + " is the largest Number");
        }
    }
}
