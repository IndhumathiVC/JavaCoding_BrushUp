package Day11;

public class DifferentTypesOfMethods {

    //Method-1: No params - No return value
    void M1(){
        System.out.println("Hello...........");
    }

    //Method-2: No params - with return value
    String M2(){
        return("Hi All Welcome back"); //or
//        return "Hi All Welcome back";
    }
    //Method-3: Takes params - No return value
    void M3(String name){
        System.out.println("How Are you " +name);
    }

    //Method-4: Takes params - with return value
    String M4(String name){
        return "How Are you " + name;
    }
    public static void main(String [] args){
        DifferentTypesOfMethods meth = new DifferentTypesOfMethods();
        meth.M1();
        String s = meth.M2();
        System.out.println(s);
        meth.M3("Indhu");
        String str = meth.M4("Indhumathi");
        System.out.println(str);
    }
}
