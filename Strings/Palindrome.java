import java.util.*;

class Palindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = sc.nextLine();
    str = str.toLowerCase().replace(" ","");
    Boolean isPalindrome = true;
    int start = 0;
    int end = str.length() - 1;
    
    while(start < end){
      if(str.charAt(start) != str.charAt(end)){
        isPalindrome = false;
        break;
      }
      start++;
      end--;
    }
    
    System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
    
  }
}