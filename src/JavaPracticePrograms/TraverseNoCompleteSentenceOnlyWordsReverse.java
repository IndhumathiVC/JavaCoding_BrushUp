package JavaPracticePrograms;

public class TraverseNoCompleteSentenceOnlyWordsReverse {
    public static void main(String [] args){
        String str = "Welcome to Java";
        String words [] = str.split(" ");
        String rev = "";

        for(String value : words){
            for(int i = value.length()-1; i>=0; i--)
            {
                rev = rev + value.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println(rev);
    }
}
