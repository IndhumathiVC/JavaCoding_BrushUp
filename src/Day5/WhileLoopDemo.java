package Day5;

public class WhileLoopDemo {
    public static void main(String [] args){

        //Example-1: Print 1 to 10 Numbers
       /*
        int i = 1;                     // initialization
        while(i<=10){                  // Condition - How many times it want to repeat
            System.out.println(i);     // Statements
            i++;                       // Incrementation
        }
        */

        //Example-2: Print "Hello" Message 10 times
        /*
        int i = 1;
        while(i<=10)
        {
            System.out.println("Hello");
            i++;
        }
        */

        //Example-3: Approach 1: print Even Numbers between 1 to 10
        /*
        int i = 2;
        while(i<=10){
                System.out.println(i);
                i+=2;
        }
         */

        //Example-3: Approach 2: print Even Numbers between 1 to 10
        /*
        int i = 1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
         */

        //Example-4: From 1 to 10 - Print which is oddNumber and EvenNumber
        /*
        int i = 1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i+ " is a EvenNumber");
            }
            else{
                System.out.println(i+ " is a OddNumber");
            }
            i++;
        }
        */

        //Example-5: Print from 10 to 1
        int i = 10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}
