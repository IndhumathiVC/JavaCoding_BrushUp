package Day9;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String [] args){
    //Example for Mutable here the array "a" is changed the existing original value or sorted but still we are story in same "a" array
        int a []  = {8,5,4,2,9,3,1,6};
        System.out.println("Before Sorting: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Before Sorting: " + Arrays.toString(a));

    //Example for Immutable here the String is not changed the existing original value. it need second time declaration for performing new action
    // because String is Immutable
    String s = "Welcome";
    s.concat(" to Java");
    System.out.println(s); // here will give only welcome will not concat because string is Immutable same declared variable cannot be changed-- it need again declaration with same naming or different naming variable

    s = s.concat(" to Java");  // it again wants to declare the variable or else it will stil print only welcome dont do concatenation
    System.out.println(s);


    }
}
