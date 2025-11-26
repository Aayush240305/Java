import java.util.*;

class ReverseString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = sc.nextLine();
    String[] str1 = str.split(" ");
    String reversed = "";
    for(int i = 0; i< str1.length; i++){
      str1[i] = new StringBuilder(str1[i]).reverse().toString();
      reversed = reversed + str1[i];
      reversed = reversed + " ";
    }
    System.out.println(reversed);
    sc.close();
  }
}