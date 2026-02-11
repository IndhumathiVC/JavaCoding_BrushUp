package JavaPracticePrograms;

import java.util.*;
public class CheckMissingAndDuplicatesInAnArrayUsingHashSet {
    public static void main(String [] args){
        int [] a = {3,4,2,9,3,7,2,1,4};

        HashSet<Integer> seen = new HashSet<>();

        for(int value : a){
           if(seen.add(value) == false){
               System.out.println("duplicates Found in Array are: " +value );
           }
        }
        int max = Arrays.stream(a).max().getAsInt();  //important to get dynamic max value in an array

        for(int i =1; i<=max; i++){
            if(seen.contains(i) == false){
                System.out.println("Missed Elements in Array are: " +i);
            }
        }

    }
}
