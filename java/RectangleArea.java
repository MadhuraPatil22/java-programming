




import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Creating an object of Area class
        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        // Calculating and displaying the area
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);

        // Closing scanner
        scanner.close();
    }
}
