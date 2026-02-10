package JavaPracticePrograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a input Number: ");
    int num = sc.nextInt();
    // Using algorithm
    int rev = 0;
        while (num != 0) {
            rev = rev*10 +num%10;
            num = num/10;
        }
System.out.println( "Reversed Number is : " +rev);
    }
}

//Second approach using StringBuffer
//StringBuffer sb = new StringBuffer(String.valueOf(num));
// StringBuffer rev = sb.reverse();

//Third approach using StringBuilder
//StringBuilder sb = new StringBuilder();
//sb.append(num);
//sb.reverse();


//EXplanation for First Approach
//    public static void main(String [] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int rev = 0;
//        while(num!=0){
//            // num = 12345
//            // inside looping  num became 1234
//            // inside looping  num became 123
//            // inside looping  num became 12
//            // inside looping  num became 1
//            rev = rev*10 + num%10;
//            // 0*10 + 12345%10  // 0 + 5  rev == 5
//            // 5*10 + 1234%10 // 50 + 4  rev = 54
//            // 54*10 + 123%10 // 540 + 3 rev = 543
//            // rev = 543 *10 + 12%10  //5430 + 2 = 5432
//            // rev = 5432*10 + 1%10  // 54320 + 1 = 54321
//            num = num/10;
//            // 12345/10  num = 1234
//            // 1234/10 num = 123
//            // 123/10  num = 12
//            //12/10  num = 1
//            // 1/10 num =0
//        }
//        System.out.println("Reversed number: " +rev);
//    }
//}

// while looping
// input  num = 12345 and output rev = 5
// again looping  input as 1234  and ouput rev became as 54
// again looping  input as 123  and ouput rev became as 543
// again looping  input as 12  and ouput rev became as 5432
// again looping  input as 1  and ouput rev became as 54321

// finally the input num = 12345 and reversed value rev = 54321