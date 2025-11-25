import java.util.*;

class MergeArray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of first array : ");
    int size1 = sc.nextInt();
    int[] arr1 = new int[size1];
    System.out.println("Enter a elements first of array : ");
    for(int i = 0; i<size1; i++){
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter a size of second array : ");
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
    System.out.println("Enter a elements second of array : ");
    for(int i = 0; i<size2; i++){
      arr2[i] = sc.nextInt();
    }
    
    int[] merge = new int[size1 + size2];
    
    int i = 0, j = 0;
    int index = 0;
    
    while(i < size1 && j < size2){
      if(arr1[i] < arr2[j]){
        merge[index] = arr1[i];
        index++;
        i++;
      }else{
        merge[index] = arr2[j];
        index++;
        j++;
      }
    }
    
    while(i<size1){
      merge[index] = arr1[i];
      index++;
      i++;
    }
    
    while(j<size2){
      merge[index] = arr2[j];
      index++;
      j++;
    }
    
    for(int k = 0; k<merge.length; k++){
      System.out.print(merge[k] + " ");
    }
    
  }
}