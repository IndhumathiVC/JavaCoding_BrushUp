package JavaPracticePrograms;

import java.util.*;
public class CheckDuplicatesInStringArrayUsingHashSet {
    public static void main(String [] args){
        String words [] = {"Java", "C", "C++", "java", "python", "Apple", "banana", "Java", "Orange", "Banana", "Java", "C", "orange", "banana"};
        boolean flag = false;
        HashSet <String> seen = new HashSet<>();
        HashSet <String> isDuplicatesAlreadyPrinted = new HashSet<>();
        for(String value: words){
            String valueLower = value.toLowerCase();
            if(seen.add(valueLower) == false && isDuplicatesAlreadyPrinted.contains(valueLower) == false){
                isDuplicatesAlreadyPrinted.add(valueLower);
                System.out.println("Duplicates Found: " +value);
                flag = true;

            }
        }

        if(flag == false){
            System.out.println("Duplicates Not Found: " +Arrays.toString(words));
        }
    }
}
