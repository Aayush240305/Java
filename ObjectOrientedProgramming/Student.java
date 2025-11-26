public class Student{
  public String name;
  public int age; 
  public double marks;
  
  public Student(String name, int age, double marks){
    this.name = name;
    this.age = age;
    this.marks = marks;
  }
  
  public void display(){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Marks : " + marks);
  }
}

class StudentMain{
  public static void main(String[] args){
   Student s1 = new Student("Aayush", 21, 98.7);
   s1.display();
   Student s2 = new Student("Pranav", 21, 87.7);
   s2.display();
  }
}