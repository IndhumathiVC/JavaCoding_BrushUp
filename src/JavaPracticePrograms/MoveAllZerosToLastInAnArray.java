package JavaPracticePrograms;

import java.util.*;
public class MoveAllZerosToLastInAnArray {
    public static void main(String[] args){
        int a [] = {1,2,3,0,4,0,6,8,0,7};
        int ZerosCount = 0;
        System.out.println("Before Moving All Zeros to Last in An Array: " +Arrays.toString(a));
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i<a.length; i++){
            if(a[i] == 0){
                ZerosCount++;
            }
            else{
                list.add(a[i]);
            }
        }

        for(int i =0; i<ZerosCount; i++){
            list.add(0);
        }

        System.out.println("After Moving All Zeros to Last in An Array: " +list);
    }
}
