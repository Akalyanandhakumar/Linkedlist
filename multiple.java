import java.util.Scanner;
public class multiple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int a=sc.nextInt();
        int c=1;
        for(int i=1;i<=a;i++){
            c=a*i;
            System.out.println(i+"*"+a+"="+c);
        }
        sc.close();
    }
}