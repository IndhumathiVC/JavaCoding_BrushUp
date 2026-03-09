package Day10;

public class student {

    int studentId ;
    String studentName;
    char grade = 'A';

    void printdata(){
        System.out.println(studentId+ "  " + studentName + "  "+grade);
    }

    public static void main(String[] args){
        student s1 = new student();
        s1.studentId = 10;
        s1.studentName = "Hema";
       s1.printdata();

        student s2 = new student();
        s2.studentId = 11;
        s2.studentName = "Velu";
        s2.printdata();
    }
}
