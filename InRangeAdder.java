import java.util.Scanner;

public class InRangeAdder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Low end of range: ");
        int low = scan.nextInt();
        System.out.print("High end of range: ");
        int high = scan.nextInt();
        int inRangeSum = 0;
        int outOfRangeSum = 0;

        System.out.println("Enter data:");
        int data = scanner.nextInt();

        while (data != 0) {
            if (data >= low && data <= high) 
                inRangeSum += data;
             else 
                outOfRangeSum += data;
            System.out.println("Enter data:");
            data = scan.nextInt();
        }
        System.out.println("Sum of in range values: " + inRangeSum);
        System.out.println("Sum of out of range values: " + outOfRangeSum);
    }
}
