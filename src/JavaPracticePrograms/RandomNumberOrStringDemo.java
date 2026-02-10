package JavaPracticePrograms;

import java.util.Random;

public class RandomNumberOrStringDemo {
    public static void main(String [] args){
        Random rand = new Random();
        //random integer
        int rand_Int = rand.nextInt(1000);
        System.out.println(rand_Int);
        //random Decimal
        double rand_double = rand.nextDouble();
        System.out.println(rand_double);

        System.out.println(Math.random());
    }
}
