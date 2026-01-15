import java.util.LinkedList;
public class LinkedListExample{
 public static void main(String[] args){
  LinkedList<String> list = new LinkedList<>();

  list.add("Apple");
  list.add("Banana");
  list.add("Cherry");

  list.addFirst("Mango");
  list.addLast("Orange");
  System.out.println(list);

  list.remove("Banana");
  System.out.println(list);

  Object array[]=list.toArray();

  for(int x=0; x<=3; x++)
  {
    System.out.println(array[x]);
  }

 }
  
}