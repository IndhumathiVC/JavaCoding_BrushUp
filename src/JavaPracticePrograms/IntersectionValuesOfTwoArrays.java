package JavaPracticePrograms;

public class IntersectionValuesOfTwoArrays {
    public static void main(String [] args){
        int a [] = {1,2,3,4,9};
        int b [] = {3,4,5,6,8,9};
        for(int i = 0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }


    }
}
