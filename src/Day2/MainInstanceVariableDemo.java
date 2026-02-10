package Day2;

class InstanceVariableDemo{
    // declaring instance variable
    public String name;
    public int age = 25;

    //Creating a default Constructor to initialize the instance variable
    public InstanceVariableDemo(){
        this.name = "Indhu";
    }
}
public class MainInstanceVariableDemo {
    public static void main(String [] args) {
        // object creation
        InstanceVariableDemo obj = new InstanceVariableDemo();
        System.out.println("Student Name:" +obj.name);
        System.out.println("Student age:" +obj.age);
    }

}
