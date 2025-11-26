class Area{
  
  public static double area(double radius){
    return Math.PI * (radius * radius);
  }
  
  public static int area(int length, int width){
    return length * width;
  }
  
  public static int area(int side){
    return side * side;
  }
  
  public static void main(String[] args){
    System.out.println("Area of circle is : " + area(4.5));
    System.out.println("Area of Rectangle is : " + area(4,5));
    System.out.println("Area of Square is : " + area(4));
  }
}