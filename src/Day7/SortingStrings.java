package Day7;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String [] args){
        String str = "Indhu went to bangalore";
        str = str.toLowerCase();
        String s [] = str.split(" ");
        System.out.println("Before Sorting: " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting: " +Arrays.toString(s));
    }
}
