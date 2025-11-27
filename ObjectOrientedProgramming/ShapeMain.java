abstract class Shape{
  abstract void area();
  
  public void display(){
   System.out.println("Shape Calculated"); 
  }
}

class Circle extends Shape{
  public double radius;
  
  Circle(double radius){
    this.radius = radius;
  }
  @Override
  void area(){
    System.out.println("Area of Circle is : " + (Math.PI * (radius * radius)));
  }
}

class Rectangle extends Shape{
  public int length, width;
  
  Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }
  @Override
  void area(){
    System.out.println("Area of Rectangle is : " + (length * width));
  }
}

public class ShapeMain{
  public static void main(String[] args){
    Shape c = new Circle(25.22);
    c.area();
    c.display();
    Shape r = new Rectangle(8,9);
    r.area();
    r.display();
  }
}


