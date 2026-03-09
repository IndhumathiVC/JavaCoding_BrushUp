package JavaPracticePrograms;

public class AnagramStringOrNotVerify {
    public static void main(String [] args){
        String s1 = "Book";
        String s2 = "Koob";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        int freq [] = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
