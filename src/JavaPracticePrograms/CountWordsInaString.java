package JavaPracticePrograms;

public class CountWordsInaString {
    public static void main(String [] args) {
        String InputStr = "I am Indhumathi, Welcome to Java tutorial";
        String str = InputStr.trim();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
         if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
             count ++;
         }
        }
        System.out.println("Number of Words in a String: " + count);
    }
}
