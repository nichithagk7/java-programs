public class university {
    String universityName = "VTU";
    static class Department {
        String departmentName = "Computer Science";
        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
    class Student {
        String studentName = "Rahul";
        void displayStudent() {
            System.out.println("university: " + universityName);
            System.out.println("Student Name: " + studentName);
        }
    }
    public static void main(String[] args) {
        university.Department d = new university.Department();
        d.displayDepartment();
        university u = new university();
        university.Student s = u.new Student();
        s.displayStudent();
    }
}
