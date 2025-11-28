import java.util.HashSet;

class HashSetMain{
  public static void main(String[] args){
    HashSet<String> list = new HashSet<>();
    list.add("Satara");
    list.add("Sangli");
    list.add("Solapur");
    list.add("Pune");
    list.add("Mumbai");
    list.add("Kolhapur");
    System.out.println(list);
    list.add("Satara");
    System.out.println(list);
    System.out.println("Satara exists : " +list.contains("Satara"));
    list.remove("Kolhapur");
     System.out.println(list);
    System.out.println("No of cities : " + list.size());
  }
}