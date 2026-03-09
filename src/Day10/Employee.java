package Day10;

public class Employee {

    int eid;
    String eName;
    String job;
    int sal;

    void display(){
        System.out.println(eid);
        System.out.println(eName);
        System.out.println(job);
        System.out.println(sal);
    }

    //or we can try from seperate main class also
 /*   public static void main (String [] args){
        Employee emp1 = new Employee();
        emp1.eid = 16;
        emp1.eName = "Indhu";
        emp1.job = "Software";
        emp1.sal = 30000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.eid = 19;
        emp2.eName = "Dimpu";
        emp2.job = "HR";
        emp2.sal = 25000;
        emp2.display();
    }*/
}
