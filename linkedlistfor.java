import java.util.LinkedList;
public class linkedlistfor{
    public static void main(String[] args){
        LinkedList<String> laptop=new LinkedList<>();
          laptop.add("acer");
          laptop.add("hp");
          laptop.add("dell");
          laptop.add("lenova");
          for(String aaa:laptop){
            System.out.println(aaa);
          }
        }
}