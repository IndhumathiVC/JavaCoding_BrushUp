package OOPS;

public class AbstractionUsingAbstract {

    static abstract class Vehicle{
        abstract void start();
        }

    static class car extends Vehicle{

        @Override
        void start() {
            System.out.println("Engine Starts");
        }
    }

    public static void main(String [] args){
        Vehicle v = new car();
        v.start();
    }
}
