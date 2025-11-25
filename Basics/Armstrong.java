import java.util.*;

class Armstrong{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int temp = num;
    int count = 0;
    while(temp > 0){
      temp = temp / 10;
      count ++;
    }
    
    int sum = 0;
    temp = num;
    
    while(temp > 0){
      int seprate = temp % 10;
      temp = temp / 10;
      sum = sum + (int)Math.pow(seprate,count);
    }
    System.out.println(num == sum ? "Armstrong" : "NotArmstrong");
  }
}