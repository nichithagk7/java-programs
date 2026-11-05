public class std{
    private String usn;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    std(String usn, String name, int marks1, int marks2, int marks3) {
        this.usn = usn;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
    }

    public static void main(String[] args) {
        std s = new std("1XX25CS001", "Rahul", 85, 90, 88);
        s.display();
    }
}
