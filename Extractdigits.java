import java.util.Scanner;
import java.util.ArrayList;

public class Extractdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Character> digits = new ArrayList<>();
        for (char ch : str.toCharArray()) {
        if (Character.isDigit(ch)) {
                
                digits.add(ch);
            }
        }
        for (int i = 0; i < digits.size(); i++) {
            System.out.print(digits.get(i));
            if (i < digits.size() - 1) {
                System.out.print(",");
            }
        }
    }
}

    

