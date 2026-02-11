package JavaPracticePrograms;

import java.util.*;
public class CheckDuplicatesInIntArrayUsingHashSet {
    public static void main(String [] args){
        int [] a = {1,2,3,8,4,5,3,2,4};
        boolean flag = false;

        HashSet <Integer>  duplicates = new HashSet<>();
        for(int value: a){
            if(duplicates.add(value) == false){
                System.out.println("Duplicates Found ELements: " +value);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Duplicates Elements Not Found: " +Arrays.toString(a));
        }
    }
}
