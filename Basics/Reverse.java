import java.util.*;

class Reverse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int temp = num;
    int reversed = 0;
    
    if(temp < 0){
      temp = -temp;
    }
    
    while(temp > 0){
      int seprate = temp % 10;
      temp = temp / 10;
      reversed = reversed * 10 + seprate;
  }
  
    if(num  < 0){
      reversed = -reversed;
    }
  
  System.out.println("Reversed Number is : " + reversed);
  sc.close();
}
}