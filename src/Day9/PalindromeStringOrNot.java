package Day9;

public class PalindromeStringOrNot {
    public static void main(String [] args){
        String str = "MADAM";
        String OrgStr = str, rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is: " +rev);
        if(OrgStr.equalsIgnoreCase(rev)){
            System.out.println(OrgStr+ " is a Palindrome String");
        }
        else{
            System.out.println(OrgStr+ " is not a Palindrome String");
        }
    }
}
