package Day9;

public class ReverseAString {
    public static void main(String [] args){
        String str = "Welcome";
        String rev = "";

        //Approach 1: using String buit in methods like length() and charAt(i)
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String: " +rev);

        //Approach 2: by convering String to Char Array method
        rev  = "";
        char a []  = str.toCharArray();
        for(int i = a.length-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println("Reversed String: " +rev);

        //Approach-3: using StringBuffer Class
        StringBuffer s  = new StringBuffer("Welcome");
        System.out.println(s.reverse());

        //Approach-4: using StringBuilder class
        StringBuilder sb = new StringBuilder("Welcome");
        System.out.println(sb.reverse());
    }
}
