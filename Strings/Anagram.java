import java.util.*;

class Anagram{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a first String : ");
    String str1 = sc.nextLine();
    str1 = str1.toLowerCase().replace(" ","");
    System.out.print("Enter a second String : ");
    String str2 = sc.nextLine();
    str2 = str2.toLowerCase().replace(" ","");
    if(str1.length() == str2.length()){
      Boolean anagram = true;
      char[] arr1 = str1.toCharArray();
      Arrays.sort(arr1);
      char[] arr2 = str2.toCharArray();
      Arrays.sort(arr2);
      int i = 0, j = 0;
      while(i< arr1.length && j< arr2.length){
        if(arr1[i] != arr2[j]){
          anagram = false;
          break;
        }
        i++;
        j++;
      }
      System.out.println(anagram?"anagram": "not anagram");
    }else{
      System.out.println("Strings are not same");
    }
    sc.close();
  }
}