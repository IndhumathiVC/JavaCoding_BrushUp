package JavaPracticePrograms;

public class FindVowelsCountAndConstantCountInAString {
    public static void main(String [] args){
        String str = "Automation Testing".toLowerCase();
        int vowelCount = 0, constantCount =0;

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else{
                constantCount++;
            }
        }
        System.out.println("Number of Vowel in given String is: " +vowelCount);
        System.out.println("Number of Constant in given String is: " +constantCount);
    }
}
