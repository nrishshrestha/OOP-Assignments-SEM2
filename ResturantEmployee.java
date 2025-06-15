interface Employee{
    void work(String role);
    void getSalary(int salary);
}

class Chef implements Employee{

    @Override
    public void work(String role) {
        System.out.println("John is a "+role);
    }

    @Override
    public void getSalary(int salary) {
        System.out.println("John has a salary of "+salary);
    }
    
}

class ImplementRE{
    public static void main(String[] args) {
        Chef chef1=new Chef();
        chef1.work("Chef");
        chef1.getSalary(100000);
    }
}