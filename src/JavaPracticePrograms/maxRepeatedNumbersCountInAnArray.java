package JavaPracticePrograms;

public class maxRepeatedNumbersCountInAnArray {
    public static void main(String args[]){
     int a [] = {1,2, 3,3, 4,3,3, 5,3, 2, 1, 4,3};
     int maxCount = 0;
     int maxElement = a[0];
     for(int i = 0; i<a.length; i++){
         int currentCount = 0;
         for(int j = 0; j<a.length; j++) {
             if(a[i] == a[j]){
                 currentCount++;
             }

             if(currentCount>maxCount){
                 maxCount = currentCount;
                 maxElement = a[i];
             }
         }
     }
     System.out.println(maxElement+ " count is: " +maxCount);
    }
}
