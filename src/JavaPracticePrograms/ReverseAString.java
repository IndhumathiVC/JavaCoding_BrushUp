package JavaPracticePrograms;

public class ReverseAString {
   public static void main(String[] args) {
        String str = "abcd";
        String rev = "";
        System.out.println("Input String is: " +str);
       // using String concatenation Operator
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }


      /* // Using Character Array
       char a[] = str.toCharArray();
       int len = a.length;
       for(int i = len-1;i>=0; i--){
           rev = rev+a[i];
       }
       */

       //Using StringBuffer
       StringBuffer sb = new StringBuffer(str);
       System.out.println("Reversed String value is: " +(sb.reverse()));
    }

}
