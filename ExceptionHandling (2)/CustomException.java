import java.util.*;

class AgeException extends Exception{
  public AgeException(String msg){
    super(msg);
  }
}

public class CustomException{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Enter your age : ");
    int age = sc.nextInt();
    if(age < 18){
      throw new AgeException("Age must be greater than 18 for validation");
    }
      System.out.println("You are eligible");
    }catch(AgeException e){
      System.out.println(e.getMessage());
    }finally{
      sc.close();
    }
  }
}