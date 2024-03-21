import java.util.Scanner;

public class AddUpNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer (enter 0 to quit): ");
        int number = scan.nextInt();

        if (number == 0) 
            System.out.println("No integers were entered.");
        else {
            int sum = 0;
            while (number != 0) {
                sum += number;
                System.out.print("Enter an integer (or 0 to quit): ");
                number = scanner.nextInt();
            }
            System.out.println("Sum of the integers: " + sum);
        }
        System.out.println("bye");
    }
}
