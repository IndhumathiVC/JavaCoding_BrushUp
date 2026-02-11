package JavaPracticePrograms;

import java.util.Arrays;

public class CheckDuplicatesInAnArray {
    public static void main(String [] args){
        String [] words = {"Java", "C", "C++", "java", "python", "Apple", "banana", "Java", "Orange", "Banana", "Java", "C", "orange", "banana"};
        boolean flag = false;
        for(int i = 0; i< words.length; i++){
            int count = 1;
            boolean isDuplicatesAlreadyPrinted = false;
            for(int k =0; k<i;k++) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    isDuplicatesAlreadyPrinted = true;
                    break;
                }
            }
            if(isDuplicatesAlreadyPrinted) continue;

            for(int j =i+1; j<words.length ; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }
           if(count>1){
               System.out.println("Duplicates Found Element: " +words[i]+ " Count is: " +count);
               flag = true;
           }
        }
        if(flag == false){
            System.out.println("Duplicates not Found: " + Arrays.toString(words));
        }
    }
}
