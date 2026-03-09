package JavaPracticePrograms;

public class ConsecutiveNumbersCountInAnArray {
    public static void main(String [] args){
        int a [] = {1,2, 3,3,3,3,3,7, 4,6, 3,3, 5,3, 2, 1, 4,3};
        int maxCount = 1;
        int currentCount = 1;
        int maxElement = a[0];

        for(int i = 1; i<a.length; i++){
            if(a[i] == a[i-1]){
                currentCount++;
            }
            else{
                currentCount = 1;
            }

            if(currentCount>maxCount){
                maxCount = currentCount;
                maxElement = a[i];
            }
        }
        System.out.println(maxElement+ " : " +maxCount);
    }
}
