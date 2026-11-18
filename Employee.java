class Employee {
    int empId;
    String name;
    double basicSalary;
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class shape {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rahul", 25000);

        e1.display();
    }
}