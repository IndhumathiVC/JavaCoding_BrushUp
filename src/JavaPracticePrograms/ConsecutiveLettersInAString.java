package JavaPracticePrograms;

public class ConsecutiveLettersInAString {
    public static void main(String [] args){
        String str = "aaaabbbccxyyyyyyzzz";
        int currentCount = 1;
        int maxCount = 1;
        char maxChar = str.charAt(0);

        for(int i =1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                currentCount++;
            }
            else{
                currentCount =1;
            }
            if(currentCount>maxCount){
                maxCount = currentCount;
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Maximum Consecutive character is: " + maxChar);
        System.out.println("Maximum Count of that Consecutive character " +maxChar+ " is: " + maxCount);
    }
}
