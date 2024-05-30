
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter Number 2: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operation: ");
        String operation = scanner.nextLine();
        
        switch (operation) {
            case "sum" -> System.out.printf("%f + %f = %f", num1, num2, num1+num2);
            case "sub" -> System.out.printf("%f - %f = %f", num1, num2, num1-num2);
            case "mul" -> System.out.printf("%f * %f = %f", num1, num2, num1*num2);
            case "div" -> {
                if (num2 == 0) {
                    System.out.println("Cannot be divide by zero");
                } else {
                    System.out.printf("%f div %f = %f", num1, num2, num1/num2);
                }
            }
            default -> System.out.println("The operation is invalid.");
        }
        
        
        scanner.nextLine();

        scanner.close();

    }
}
