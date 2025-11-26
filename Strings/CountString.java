import java.util.*;

class CountString{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = sc.nextLine();
    str = str.toLowerCase();
    int vowelsCount = 0;
    int consonantsCount = 0;
    int spacesCount = 0;
    int digitCount = 0;
    
    for(int i = 0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vowelsCount++;
      }else if(ch == ' '){
        spacesCount++;
      }else if(Character.isDigit(ch) == true){
        digitCount++;
      }else{
        consonantsCount++;
      }
    }
    
    System.out.println("Count of vowels in string is : " + vowelsCount);
    System.out.println("Count of consonants in string is : " + consonantsCount);
    System.out.println("Count of digits in string is : " + digitCount);
    System.out.println("Count of spaces in string is : " + spacesCount);
    
  }
}