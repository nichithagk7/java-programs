public class rectangle{
    double length;
    double breadth;
    double calculateArea() {
        return length * breadth;
    }
    public static void main(String[] args){
        rectangle r = new rectangle();
        r.length = 10;
        r.breadth = 5;
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
