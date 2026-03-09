package JavaPracticePrograms;

import java.util.Scanner;

public class FindVowelsAndConstantsInAString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input String:");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Vowels in the given String are: ");
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1){
                System.out.println(ch);
            }
        }
        System.out.println("Constants in the given String are: ");
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if("aeiouAEIOU".indexOf(ch) == -1){
                System.out.println(ch);
            }
        }
    }
}
