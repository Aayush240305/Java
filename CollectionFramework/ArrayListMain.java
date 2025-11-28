import java.util.ArrayList;

class ArrayListMain{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    list.add("Aayush");
    list.add("Om");
    list.add("Kiran");
    list.add("Pranav");
    list.add("Shree");
    
    System.out.println(list);
    
    list.remove(1);
    
    System.out.println(list);
    
    System.out.println("Aayush exists : "  + list.contains("Aayush"));
    
    System.out.println("list size : " + list.size());
    
  }
}
