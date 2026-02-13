package JavaPracticePrograms;

public class RemoveExtraSpaceInAString {
    public static void main(String [] args){
        String str = "Code Execution Successful";
       //Approach-1:
       /*  String result = "";
        System.out.println("Before Space Removal: " +str);
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            else{
                result = result + ch;
            }
        }
        System.out.println("After Space Removal: " +result);
        */

       //Approach-2:
        System.out.println("Before Space Removal: " +str);
        str = str.replaceAll("\\s", "");
        System.out.println("After Space Removal: " +str);

    }
}
