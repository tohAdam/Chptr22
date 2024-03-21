import java.util.Scanner;

public class CADProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Computer Aided Design Program");
            System.out.print("First corner X coordinate: ");
            int x1 = scan.nextInt();
            System.out.print("First corner Y coordinate: ");
            int y1 = scan.nextInt();
            System.out.print("Second corner X coordinate: ");
            int x2 = scan.nextInt();
            System.out.print("Second corner Y coordinate: ");
            int y2 = scan.nextInt();
          
            if (x1 == x2 || y1 == y2) 
                System.out.println("Invalid input: Not a rectangle.");
                break;
          
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            int area = width * height;
            System.out.println("Width: " + width + "\tHeight: " + height + "\tArea: " + area + "\n");
        } System.out.println("finished");
    }
}
