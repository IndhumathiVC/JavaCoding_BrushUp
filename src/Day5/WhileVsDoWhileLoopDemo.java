package Day5;

public class WhileVsDoWhileLoopDemo {
    public static void main(String [] args){
        //while loop demo vs do while loop demo Here in the while loop i value 20 is not less than 10 so the output will not print any statements
       /*
        int i = 20;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        */

        //do-while loop -- in the  do-while loop atleast once the statement will be executed and then will checks the condition
        int i = 20;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
