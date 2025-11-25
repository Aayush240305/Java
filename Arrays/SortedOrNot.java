import java.util.*;

class SortedOrNot{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter a elements of array : ");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    Boolean sort = true;
    for(int i = 0; i<size-1; i++){
      if(arr[i] > arr[i+1]){
        sort = false;
        break;
      }
    }
    System.out.println(sort?"Array is sorted!" : "Array is not sorted!");
    
    sc.close();
  }
}