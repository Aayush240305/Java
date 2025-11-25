import java.util.*;

class ReverseArray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter a elements of array : ");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    
    int start = 0;
    int end = size - 1;
    
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println("Reversed Array is : ");
    for(int i = 0; i<size; i++){
      System.out.print(arr[i] + " ");
    }
  }
}