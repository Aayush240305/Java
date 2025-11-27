import java.util.*;

class ArithmeticExceptionExample{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Enter two numbers : ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int result = num1/num2;
      System.out.println("Division is " + result);
    }catch(ArithmeticException e){
      System.out.println("We can't divide any number by zero");
    }catch(InputMismatchException e){
      System.out.println("Given input is not a integer");
    }finally{
      System.out.println("Execution Completed");
      sc.close();
    }
  }
}