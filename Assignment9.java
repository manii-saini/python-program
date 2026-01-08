class Shape
 {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    public int area(int side) {
        return side * side;
    }
    
    public int area(int length, int breadth) {
        return length * breadth;
    }
    
    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
class Area
    {
    public static void main(String[] args) 
{
        Shape s = new Shape();
        System.out.println("Circle Area: " + s.area(5.0));
        System.out.println("Square Area: " + s.area(4));
        System.out.println("Rectangle Area: " + s.area(4, 6));
        System.out.println("Triangle Area: " + s.area(4.0, 6.0, true));
    }
}