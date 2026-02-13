package JavaPracticePrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharctersInAStringUsingSet {
    public static void main(String [] args){
        String str = "Successful";
        str = str.toLowerCase();
        String result = "";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        for(char ch : set){
            result = result+ch;
        }
        System.out.println(result);
    }
}
