public class caluclator {
    int calculate(int a, int b) {
        return a + b;
    }
    double caluclate(double a, double b) {
        return a * b;
    }
    int caluclate(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    double caluclate(int a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        caluclator c = new caluclator();
        System.out.println("Sum: " + c.caluclate(10, 20));
        System.out.println("Product: " + c.caluclate(2.5, 4.0));
        System.out.println("Largest: " + c.caluclate(10, 25, 15));
        System.out.println("Difference: " + c.caluclate(10, 3.5));
    }
}
