import java.util.*;

class DuplicateString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = sc.nextLine();
    str = str.toLowerCase().replace(" ","");
    String result = "";
    
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(result.indexOf(ch) == -1){
        result = result + ch;
      }
    }
    
    System.out.println("String without duplicates : " + result);
    sc.close();
  }
}