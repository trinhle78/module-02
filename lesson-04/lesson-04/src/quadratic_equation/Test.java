package quadratic_equation;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str = "codegymcodegym";
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(character == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
