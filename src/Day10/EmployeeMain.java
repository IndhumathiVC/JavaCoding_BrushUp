package Day10;

public class EmployeeMain {
    public static void main(String [] args){
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
    }
}
