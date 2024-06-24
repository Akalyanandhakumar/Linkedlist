import java.util.LinkedList;
public class linkedlistremovesize{
    public static void main(String[] args){
        LinkedList<String> laptop=new LinkedList<>();
          laptop.add("acer");
          laptop.add("hp");
          laptop.add("dell");
          laptop.add("lenova");
          laptop.add("ipad");
          laptop.removeLast();
          System.out.println(laptop);
          System.out.println(laptop.size());

          
       
    }
}