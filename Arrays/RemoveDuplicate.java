import java.util.*;

class RemoveDuplicate{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter a elements of array : ");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    
    HashSet<Integer> unique= new HashSet<>();
    for(int i = 0; i<size; i++){
      unique.add(arr[i]);
    }
    
    System.out.println("Array without duplicates values" +  unique);
}
}