import java.util.LinkedList;
public class linkedlistifelse{
    public static void main(String[] args){
        LinkedList<String>techno=new LinkedList<>();
        techno.add("java");
        techno.add("php");
        techno.add("react");
        techno.add("html");
        techno.add("javascript");
        if(techno.contains(("java"))){
            System.out.println("Techno is present");
        }
        else{
            System.out.println("Techno is not present");
        }
        
        
    }
}