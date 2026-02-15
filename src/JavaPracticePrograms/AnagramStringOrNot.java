package JavaPracticePrograms;

import java.util.*;

public class AnagramStringOrNot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: s1 = ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter Second String: s2 = ");
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
