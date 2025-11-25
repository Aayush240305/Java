import java.util.*;

class MaxMin{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter a elements of array : ");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    
    int max = arr[0];
    int min = arr[0];
    
    for(int i = 1; i<size; i++){
      if(max < arr[i]){
        max = arr[i];
      }
      if(min > arr[i]){
        min = arr[i];
      }
    }
    
    System.out.println("Maximum Elmement within array is " +  max);
    System.out.println("Minimum element within array is " + min);
  }
}