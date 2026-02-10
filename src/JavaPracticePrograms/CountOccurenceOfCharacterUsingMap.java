package JavaPracticePrograms;

import java.util.*;
public class CountOccurenceOfCharacterUsingMap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine().toLowerCase();
        Map <Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            if(map.containsKey(ch)){
                map.put(ch, (map.get(ch)+1));
            }
            else{
                map.put(ch,1);
            }
        }
        for( char key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
