public class Employee {
    private String name;
    private String jobTitle;
    private float salary;

    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void increaseSalary(float amount) {
        salary += amount;
    }

    public void decreaseSalary(float amount) {
        salary -= amount;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Hary", "MD", 100000);
        employee1.increaseSalary(5000);
        employee1.decreaseSalary(2000);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Job Title: " + employee1.getJobTitle());
        System.out.println("Updated Salary: " + employee1.getSalary());
    }
}
