package Day3;

public class TernaryOperatorDemo {
    public static void main(String [] args) {
        // 6) Conditional/Ternary Operators are ?:
        // Syntax is var = exp ? result1 : result2;

        //Ex 1:
        int a = 200,  b=100;
        int x = (a>b) ? a : b;
        System.out.println(x);      //Here condition becames true so Result1 we got

        //Ex 2:
        int y = (a<b) ? a :b;
        System.out.println(y);     //Here condition becames false so Result2 we got

        //Ex 3:
        int person_age = 25;
        String res =  (person_age >=18) ? "Eligible" : "Not ELigible" ;  //Here condition becames true so Result1 we got
        System.out.println(res);

        //Ex 4:
        person_age = 15;
        String VotingRes =  (person_age >=18) ? "Eligible" : "Not ELigible" ;     //Here condition becames false so Result2 we got
        System.out.println(VotingRes);

    }
}
