package OOPS;

public class Inheritance {

    static class BaseTest{
         void setUp(){
            System.out.println("Browser Opened Successfully");
        }
    }

    static class LoginPage extends BaseTest{
         void login(){
            System.out.println("User is on Login Page");
        }
    }
    public static void main(String [] args){
        LoginPage lp = new LoginPage();
        lp.setUp();
        lp.login();

    }
}
