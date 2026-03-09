package Day9;

import java.util.*;
public class StringVsStringBufferVsStringBuilder {
    public static void main(String args[]){
        // String is Immutable
        String s = new String("Selenium");
        s.concat(" with Java And Python");
        System.out.println(s); // it will not print concated output because String is Immutable

//Only in StringBuffer and StringBuilder we have append() method which does the same purpose of concatenation. Because concat() method not supports in StringBuffer Class or StringBuilder Class
        //StringBuffer is Mutable
        StringBuffer str = new StringBuffer("Selenium");
        str.append(" with Java And Python");
        System.out.println(str); // Selenium with Java And Python is changed  in StringBuffer class

        //StringBuilder is Mutable
        StringBuilder sb = new StringBuilder("Selenium");
        sb.append(" with Java And Python");
        System.out.println(sb); // Selenium with Java And Python is changed in StringBuilder class


    }
}
