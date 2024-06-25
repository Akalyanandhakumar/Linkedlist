import java.util.LinkedList;
public class linkedlistadd{


    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<>();
          names.add("mukunth");
          names.add("vinitha");
          names.add("kavitha");
          names.add("janu");
          names.add("banu");
          System.out.println(names);
          LinkedList<String> name=new LinkedList<>();
          name.add("abc");
          name.add("efg");
          System.out.println(name);
          names.addAll(name);
          System.out.print(names);
    }
}










//[mukunth, vinitha, kavitha, janu, banu]
//[abc, efg]
//[mukunth, vinitha, kavitha, janu, banu, abc, efg]
