import java.util.Scanner;

class Area{
  private double length;
  private double breadth;
 
  public void setDim(double length, double breadth){
   this.length=length;
   this.breadth=breadth;
   }

  public double getArea(){
   return length*breadth;
   }
  }

class RectangleArea {
 public static void main(String[] args){
  Scanner scanner= new Scanner(System.in);

  System.out.println("Enter length  of the rectangle : ");
   double length = scanner.nextDouble();

  System.out.println("Enter breadth  of the rectangle : ");
  double breadth = scanner.nextDouble();
 }
}
 
void main(){
Area rectangle=new Area();
rectangle.setDim(length,breadth);
double Area=rectangle.getArea();
System.out.println("Area of the reactangle : "+rectangle.getArea());

scanner.close();
}