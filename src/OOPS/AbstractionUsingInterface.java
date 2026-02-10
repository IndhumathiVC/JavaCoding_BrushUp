package OOPS;

public class AbstractionUsingInterface {
    interface Parent{
        abstract void start();
    }

    static class child implements Parent{
        public void start(){
            System.out.println("User is on Login Page");
        }
    }

    public static void main(String [] args){
        Parent p = new child();
        p.start();


    }
}
