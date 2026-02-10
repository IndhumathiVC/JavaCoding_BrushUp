package JavaPracticePrograms;

public class EvenOrOddInAnArray {
    public static void main(String [] args){
        int a[] = {1,2,3,4,5,5};
        int evenCount = 0, oddCount = 0;
        System.out.println("Extract EvenNumbers:=================================");
        for(int i =0; i< a.length; i++){
            if(a[i]%2==0){
                evenCount++;
                System.out.println(a[i]);
            }
        }
        System.out.println("EvenNumbers Count in given array is: " +evenCount);
        System.out.println("Extract OddNumbers:=================================");
        for(int i =0; i< a.length; i++){
            if(a[i]%2!=0){
                oddCount++;
                System.out.println(a[i]);
            }
        }
        System.out.println("OddNumbers Count in given array is: " +oddCount);
    }
}
