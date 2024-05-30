
import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numbers[] = {1,2,3,4,5};

            int copyOFnumbers[] = Arrays.copyOf(numbers, numbers.length); //by defining this way, the copied array's value won't be Changed.

            numbers[0] = 6;

            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(copyOFnumbers));

            int copyOFnumbers2[] = Arrays.copyOf(numbers, 10); // defining new array
            System.out.println(Arrays.toString(copyOFnumbers2));

            copyOFnumbers2[0] = 1;
            copyOFnumbers2[9] = 10;
            System.out.println(Arrays.toString(copyOFnumbers2));
            
            System.out.print("Enter starting index: ");
            int staringindex = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter ending index: ");
            int endingindex = scanner.nextInt();
            scanner.nextLine();

            int copyOFnumbers3[] = Arrays.copyOfRange(numbers, staringindex, endingindex); // defining new array here also

            System.out.println(Arrays.toString(copyOFnumbers3));

            scanner.close();
        }

    }
}
