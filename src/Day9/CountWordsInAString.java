package Day9;

import java.util.*;
public class CountWordsInAString {
    public static void main(String[] args) {
        String str = "Welcome to Java Selenium with Java is Easy to Learn";
        str = str.trim();
        int count =1;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
               count++;
            }
        }
        System.out.println("Total Count of Words in a String is: " +count);

        //Now lets see the logic for Count of each word in above given String
        String words[] = str.split(" ");
        Map <String, Integer> map = new LinkedHashMap<>();

        for(int i =0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], (map.get(words[i])+1));
            }
            else{
                map.put(words[i],1);
            }
        }
        for(String key : map.keySet()){
            System.out.println(key+ " : " +map.get(key));
        }
    }
}