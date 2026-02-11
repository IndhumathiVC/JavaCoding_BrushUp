package JavaPracticePrograms;

public class TraverseNoOnlyReverseFirstWordInASentence {
    public static void main(String [] args){
        String str = "Hello world , Welcome to Java";
        String words [] = str.split(" ");
        String targetWord = words[0];
        String rev = "";

        for(int i = targetWord.length()-1; i>=0; i--){
            rev = rev + targetWord.charAt(i);
        }
        words[0] = rev;

        for(String sentence : words){
            System.out.print(sentence + " ");
        }
    }
}
