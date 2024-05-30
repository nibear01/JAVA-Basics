
import java.util.Scanner;


public class TakingUserInput2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What's your name?");
            String name = scanner.nextLine();
            
            System.out.printf("My name is %s", name);
        }
    }
}
