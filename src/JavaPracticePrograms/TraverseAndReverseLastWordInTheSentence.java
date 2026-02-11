package JavaPracticePrograms;

public class TraverseAndReverseLastWordInTheSentence {
    public static void main(String [] args){
        String str = "Hello world , Welcome to Java";
        String words [] = str.split(" ");
        String targetWord = words[words.length-1];
        String rev = "", traverse = "";

        for(int i = targetWord.length()-1; i>=0; i--){
            rev = rev +targetWord.charAt(i);
        }
        words[words.length-1] = rev;
        for(int i = words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
