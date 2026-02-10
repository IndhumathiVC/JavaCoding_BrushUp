package Day2;

public class ParameterizedInstanceVariableDemo {
    private String name;
    private int age ;
    // Parameterzed Constructor
    public ParameterizedInstanceVariableDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getter methods -- Encapsulation
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
