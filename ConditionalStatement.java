import java.util.Scanner;

public class ConditionalStatement {
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
        

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", num1, num2, num1+num2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", num1, num2, num1-num2);
        } else if (operation.equals("div")) {
            if (num2 == 0) {
                System.out.println("Cannot be divide by  Zero.");
            } else {
                System.out.printf("%f div %f = %f", num1, num2, num1/num2);
            }
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", num1, num2, num1*num2);
        } else {
            System.out.println("The operation is invalid.");
        }
        
        scanner.nextLine();

        scanner.close();

    }
}
