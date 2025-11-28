import java.util.HashMap;

class HashMapMain{
  public static void main(String[] args){
    HashMap<String, Integer> list = new HashMap<>();
    list.put("Aayush",95);
    list.put("Shree",100);
    list.put("Pranav",98);
    list.put("Kiran",96);
    list.put("Om",97);
    System.out.println(list);
    list.get("Om");
    list.put("Om", 99);
    list.remove("Om");
    System.out.println(list);
    System.out.println(list.size());
  }
}