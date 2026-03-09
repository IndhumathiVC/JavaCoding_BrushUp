package Day8;

import java.util.Arrays;

public class StringMethods {
    public static void main(String [] args){
       //Approach-1 of declaring a String
        String s = "Automation";
        System.out.println(s);

        // Approach-2 of declaring a String
        String s1 = new String("Welcome");
        System.out.println(s1);

        //finding length of any String -- length()
        System.out.println(s.length());

        //concat --- it is nothing but joining two or more Strings using + Operator
        String str1 = "Welcome to Selenium";
        String str2 = " And Java";
        String concatResult = str1+str2;
        System.out.println(concatResult);

        //trim() -- trimming space - right and left side both side spaces
        String s2 = "    welcome to Java  ";
        System.out.println("Before trimming:" +s2);
        s2 = s2.trim();
        System.out.println("After trimming:" +s2);

        //charAt(i) --- we can fetch any specific  character in a String based on the index
        String s3 = "Selenium";
        char ch = s3.charAt(1);
        System.out.println(ch);

        //contains() method -- verify a string or character is present in given String or sentence
        String s4 = "Welcome to Selenium";
        System.out.println(s4.contains("sel")); // false because sel is present but not capital -- java is case sensitive so if "Sel" then true

        //equals and equalsIgnoreCase() method
        String str3 = "Apple";
        String str4 = "apple";
        System.out.println(str3.equals(str4)); //false because of case-sensitive in Java
        System.out.println(str3.equalsIgnoreCase(str4)); // true because here we are ignoring the case


        //replace("", "") --- replace any single character in a String or any word in a String
        String s6 = "Welcome to Selenium";
        s6 = s6.replace("e","x");
        System.out.println(s6);
        String s7  = "Welcome to Selenium";
        s7 = s7. replace("Selenium", "Java");
        System.out.println(s7);


        //subString(starting Index, endingIndex+1)
        String str = "Coding";
        str = str.substring(0,4); // output will be Codi
        System.out.println(str);

        //toLowerCase()
        str = "Booking";
        System.out.println(str.toLowerCase());
        //toUpperCase()
        System.out.println(str.toUpperCase());


        //split() --- we can split the string into multiple parts based on the delimter
        // but we cannot perform split method for few operators Example:  * ^ %  & ) (
        str = "abc@gmail.com";
        String [] a = str.split("@");
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);

        //Examples : ex:1
        String amount = "$15,20,55";   //expected output is 152055
        amount = amount.replace("$","").replace(",","");
        System.out.println(amount);

        //ex:2
        s = "abc,123@xyz";
        String arr [] = s.split(",");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String words[] = arr[1].split("@");
        System.out.println(Arrays.toString(words));
        System.out.println(arr[0]);
        System.out.println(words[0]);
        System.out.println(words[1]);


        //ex:3
        s= "abc 123";
       String ar [] = s.split(" ");
       System.out.println(Arrays.toString(ar));

       // we cannot use * % ^ & ) ( delimeters for split() string method


        // Ex:4
        s = "John Fedrick";
        System.out.println(s.contains("john"));  // false
        System.out.println(s.toLowerCase().contains("john")); // true


    }
}
