class Employee {
    void work() {
        System.out.println("Employee is working");
    }
    double getSalary() {
        return 50000.0;
    }
}

class HrManager extends Employee {
    void work() {
        System.out.println("HR Manager is managing HR tasks");
    }
}

public class Question2 {
    public static void main(String[] args) {
        HrManager Hr = new HrManager();
        Hr.work();
        System.out.println("Salary: $"+Hr.getSalary() );
    }
}
