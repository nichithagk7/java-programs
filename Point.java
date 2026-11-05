class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x coordinate:" + x);
        System.out.println("y coordinate:" + y);
        System.out.println("Point:(" + x + "," + y + ")");
        if (x > 0 && y > 0) {
            System.out.println("Point lies in 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in 3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in 4th quadrant");
        } else {
            System.out.println("Point lies on an axis or origin");
        }
    }
    public static void main(String args[]) {
        Point P = new Point(-3, 4);
        P.display();
    }
}
