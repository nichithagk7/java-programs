import java.util.Scanner;
class stud {
    String usn, name, branch;
    long phone;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLong();
        sc.nextLine();
    }

    void display() {
        System.out.println(usn + "\t" + name + "\t" + branch + "\t" + phone);
    }
}
class student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        stud s[] = new stud[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = new stud();
            System.out.println("\nEnter details of Stud " + (i+1));
            s[i]. getDetails ();
        }
        System.out.println("\n----- STUD DETAILS -----");
        System.out.println("USN\tName\tBranch\tPhone");
        for(int i = 0; i < n; i++)
        {
            s[i].display();
        }
    }
}