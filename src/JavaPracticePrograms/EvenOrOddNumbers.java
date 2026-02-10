package JavaPracticePrograms;

public class EvenOrOddNumbers {
    public static void main(String [] args){
        int number = 0;
        while(number<=1000){
            if(number%2==0){
                System.out.println("Even Numbers from 1 to 1000 are:" +number);
            }
            else {
                System.out.println("Odd Numbers from 1 to 1000 are:" +number);
            }
            number++;
        }
    }
}
