public class Employeea {
    private String name;
    private String employeeId;
    private double salary;

    public Employeea(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public boolean updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employeea emp = new Employeea("Charlie", "E2001", 50000);
        System.out.println("Salary: $" + emp.getSalary());
        emp.updateSalary(2500);
        System.out.println("Updated Salary: $" + emp.getSalary());
        boolean success = emp.updateSalary(-60000);
        System.out.println("Attempt to reduce too much: " + (success ? "Success" : "Failed"));
        System.out.println("Final Salary: $" + emp.getSalary());
    }
}
