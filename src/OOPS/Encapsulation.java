package OOPS;

public class Encapsulation {
    private int sso;
    private String  password;

    public int getSso(){
        return sso;
    }
    public void setSso(int sso){
        this.sso = sso;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public static void main(String [] args){
        Encapsulation encaps = new Encapsulation();
        encaps.setSso(5050);
        encaps.setPassword("abcd");

        System.out.println(encaps.getSso());
        System.out.println(encaps.getPassword());
    }
}
