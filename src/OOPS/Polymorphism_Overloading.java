package OOPS;

public class Polymorphism_Overloading {
    static class login {

        public String userName(){
            return "Indhumathi";
        }
        public String userName(String userName) {
            return userName;
        }

        public int password(int password) {
            return password;
        }
    }
    public static void main(String[] args){
        login l = new login();
       String s = l.userName("Indhu");
       int i = l.password(1234);
        System.out.println(s);
        System.out.println(i);
    }
}
