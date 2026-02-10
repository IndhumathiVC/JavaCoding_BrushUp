package JavaPracticePrograms;

import java.util.Arrays;

public class CheckTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3,5};
//Approach-1:
//        boolean status = Arrays.equals(a1,a2);
//        if(status == true){
//            System.out.println("Arrays are Equal");
//        }
//        else{
//            System.out.println("Arrays are not Equal");
//        }

        //Approach-2:
        boolean status = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    status = false;
                    System.out.println("Arrays are Not Equal");
                }
            }
        }
        else{
            status = false;
            System.out.println("Arrays are Not Equal");
        }
        if (status == true) {
            System.out.println("Arrays are Equal");
        }
    }
}
