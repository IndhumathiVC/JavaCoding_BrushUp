package JavaPracticePrograms;

public class CountOccurenceOfCharacter {
    public static void main(String [] args){
        String str = "Hello I am Indhu Welcome to Java Tutorial";
        str = str.toLowerCase();
      /*  // First Approach
        int totalCount = str.length();
        int totalCount_AfterRemoval = str.replace("i", "").length();
      int ResultCount_Occurence = totalCount - totalCount_AfterRemoval;
      System.out.println("Character CountOccurence in String is: " +ResultCount_Occurence);
      */

      // Second Approach
      int count = 0;
      for(int i = 0; i< str.length(); i++){
          if(str.charAt(i) == 'w'){
              count++;
          }
      }
      System.out.println("Character CountOccurence in String is: " + count);
    }
}
