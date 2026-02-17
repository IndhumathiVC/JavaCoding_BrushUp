package JavaPracticePrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAllsWordEachWordCountsInASentence {
    public static void main(String [] args){
        String str = "Hello I am Indhu Welcome to Java Hello World Code Execution Successful Code";
        String [] words = str.split(" ");

        Map<String , Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<words.length; i++){
           if(map.containsKey(words[i])){
               map.put(words[i],map.get(words[i])+1);
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
