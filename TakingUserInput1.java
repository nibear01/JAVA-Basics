import java.util.Scanner;

class TakingUserInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? ", name);
        int age = Integer.parseInt(scanner.nextLine());  //parseInt method convert string to a integer
        
        //cleans up the next line (ENTER)
        //scanner.nextLine();

        System.out.printf("%d is a age of dreams! what's your dream? ", age);
        String dream = scanner.nextLine(); 
        
        System.out.printf("%s is a good profession. good luck with that!", dream);
        System.out.print("\nwhat is your cgpa? ");
        double gpa = Double.parseDouble(scanner.nextLine());  
         
        System.out.println(gpa);
 
        scanner.close();
    }
}
