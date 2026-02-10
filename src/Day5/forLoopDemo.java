package Day5;

public class forLoopDemo {
    public static void main(String [] args){

        //Example-1 : Print 1 to 10 numbers
        /* for(int i =1; i<=10; i++){
            System.out.println(i);
        }
        */

        //Example-2: EvenNumbers between 1 to 10
         /* for(int i = 2; i <=10; i+=2 ){
             System.out.println(i);
         }
          */

        //Example-3: Print EvenNumbers & OddNumbers from 1 to 10
        //Approach-1
        /* for( int i = 1; i<=10; i+=2){
            System.out.println(i + " is a OddNumber");
        }
        for(int i = 2; i<=10; i+=2){
            System.out.println(i+ " is a EvenNumber");
        }
       */

        //Example-3: Print EvenNumbers & OddNumbers from 1 to 10
        //Approach-2
        /* for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i+ " is a EvenNumber");
            }
            else{
                System.out.println(i+ " is a OddNumber");
            }
        }
        */

        //Example-4: Print 1 to 10 descending order
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }
}
