package Day2;

class Student{
    static int age;
}
public class StaticInstanceVariableDemo {
    public static void main(String [] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 24;
        s2.age = 25;
        Student.age = 23;

        System.out.println("Student1 age is:" +s1.age);
        System.out.println("Student2 age is:" +s2.age);
    }
}
