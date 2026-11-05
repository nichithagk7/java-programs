public class circle{
    double radius;
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculatecircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args){
        circle c = new circle();
        c.radius = 7;
        System.out.println("Radius: " + c.radius);
        System.out.println("Area of circle: " + c.calculateArea());
        System.out.println("circumference of circle: "
                + c.calculatecircumference());
    }
}
