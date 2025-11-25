import java.util.*;

class PrimeOrNot{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    Boolean result = true;
    if(num <= 1){
        result = false;
      }else{
      for(int i = 2; i < num; i++){
      if(num % i == 0){
        result = false;
        break;
      }
    }
  }
    System.out.println(result ? "Prime" : "NotPrime");
  }
}