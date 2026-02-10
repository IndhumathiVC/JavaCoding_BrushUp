package Day6;

public class PrintEvenOrOddNumberFromAnArray {
    public static void main(String[] args){
    int arr[] = {1,2,3,4,6,6};
    int EvenNumberCount = 0;
    int OddNumberCount = 0;

    //to get count of even & oddNumbers
    for(int i =0; i<arr.length; i++){
        if (arr[i] % 2 == 0) {
            EvenNumberCount++;
        }
        else{
            OddNumberCount++;
        }
    }
    System.out.println("Number of EvenNumbers in given Array is: " +EvenNumberCount);
    System.out.println("Number of OddNumbers in given Array is: " +OddNumberCount);

    //to extract even numbers & odd Numbers
    System.out.println("EvenNumbers Extracted from given Array are: ");
    for(int i=0; i<arr.length; i++){
          if(arr[i]%2==0){
            System.out.println(arr[i]);
        }
    }
        System.out.println("OddNumbers Extracted from given Array are: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

        //By Using enhanced for loop or for each loop
        for(int value : arr) {
            if (value % 2 == 0) {
                System.out.println(value + " is an EvenNumber");
            } else {
                System.out.println(value + " is an OddNumber");
            }
        }
    }
}
