public class Student {
    int id;
    String name;
    int age;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to the first object
        s1.id = 101;
        s1.name = "Rahul";
        s1.age = 20;

        // Assign values to the second object
        s2.id = 102;
        s2.name = "Priya";
        s2.age = 19;

        // Display student details
        s1.display();
        s2.display();
    }
}
