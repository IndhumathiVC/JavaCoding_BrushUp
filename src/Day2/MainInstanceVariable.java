package Day2;

public class MainInstanceVariable {
    public static void main(String [] args){
        ParameterizedInstanceVariableDemo obj2 = new ParameterizedInstanceVariableDemo("Dimpu", 23);
        System.out.println("Student Name:" +obj2.getName());
        System.out.println("Student age:" +obj2.getAge());
    }
}
