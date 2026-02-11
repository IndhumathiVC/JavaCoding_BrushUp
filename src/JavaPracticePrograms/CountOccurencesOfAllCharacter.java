package JavaPracticePrograms;

public class CountOccurencesOfAllCharacter {
    public static void main(String [] args){
        String str = "Code Execution Successful";
        str = str.toLowerCase();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == i) {
                int count = 0;
                if(ch == ' ') continue;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " : " + count);
            }
        }
    }
}
