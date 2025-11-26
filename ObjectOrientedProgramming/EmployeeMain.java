class Employee{
  private String name;
  private double salary;
  private String department;
  
  void setInfo(String name, double salary, String department){
    this.name = name;
    this.salary = salary;
    this.department = department;
  }
  
  void getInfo(){
    System.out.println("Name : " + name);
    System.out.println("Salary : " + salary);
    System.out.println("department : " + department);
  }
  
  void incrementSalay(double amount){
    this.salary = this.salary + amount;
  }
}

public class EmployeeMain{
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.setInfo("Aayush",50000.00,"IT");
    System.out.println("Before Incrementing : ");
    e1.getInfo();
    e1.incrementSalay(50000.00);
    System.out.println("After Incrementing : ");
    e1.getInfo();
    System.out.println("-------------");
    Employee e2 = new Employee();
    e2.setInfo("Ram",50000.00,"IT");
    System.out.println("Before Incrementing : ");
    e2.getInfo();
    e2.incrementSalay(50000.00);
    System.out.println("After Incrementing : ");
    e2.getInfo();
}
}