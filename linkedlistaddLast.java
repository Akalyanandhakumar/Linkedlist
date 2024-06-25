import java.util.LinkedList;

public class linkedlistaddLast {
    public static void main(String[] args){
          LinkedList<String> colors=new LinkedList<>();
        colors.add("lavender");
        colors.add("purple");
       
        System.out.println(colors);
        colors.addLast("brown");
        System.out.println(colors);
        colors.addFirst("pink");
        System.out.print(colors);
    }
}
