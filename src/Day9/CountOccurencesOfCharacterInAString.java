package Day9;

public class CountOccurencesOfCharacterInAString {
    public static void main(String [] args){
        String s = "abcabcabcaaabbbccc";
        String result = "";

       for(int i =0; i<s.length();i++){
           char ch = s.charAt(i);
           if(s.indexOf(ch) == i){
               int count = 0;
               for(int j =0; j<s.length(); j++){
                   if(s.charAt(j) == ch) {
                       count++;
                   }
               }
               System.out.print(ch+""+count); // output : a6b6c6
           }
       }

    }
}
