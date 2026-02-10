package JavaPracticePrograms;

public class SecondNonRepeatedLetter {
    public static void main(String [] args){
        String inputStr = "Indhu";
        String str = inputStr.toLowerCase();
        int count = 0;
        Character result = null;
        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                count++;
                if (count == 2) {
                    result = ch;
                    break;
                }
            }
        }
        System.out.println("Second Non Repeater Character is: " + result);
    }
}
