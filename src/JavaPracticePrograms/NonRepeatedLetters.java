package JavaPracticePrograms;

import java.util.Scanner;

public class NonRepeatedLetters {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String Input = sc.next();
        String str = Input.toLowerCase();
        Character result = null;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result = ch;
                break;
            }
        }
        System.out.println(result);
    }
}
