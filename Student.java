public class Student {
    private String name;
    private String idNumber;
    private double gpa;

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student("Bob", "S1001", 3.75);
        System.out.println("Student Name: " + student.getName());
        System.out.println("ID: " + student.getIdNumber());
        System.out.println("GPA: " + student.getGpa());
        student.setName("Bobby");
        System.out.println("Updated Name: " + student.getName());
    }
}
