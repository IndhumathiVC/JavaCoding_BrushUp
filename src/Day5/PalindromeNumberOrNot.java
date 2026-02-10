package Day5;

public class PalindromeNumberOrNot {
    public static void main(String[] args){
        int num = 121;
        int orgNum = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reversed Number is: " + rev);
        if(orgNum == rev){
            System.out.println(orgNum + " is a PalindromeNumber");
        }
        else{
            System.out.println(orgNum + " is not a PalindromNumber");
        }
    }
}
