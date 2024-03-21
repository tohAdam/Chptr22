import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Miles Per Gallon Program");
            System.out.print("Initial miles: ");
            int initialMiles = scan.nextInt();
          
            if (initialMiles < 0) 
                System.out.println("bye");
                break;

            System.out.print("Final miles: ");
            int finalMiles = scan.nextInt();

            System.out.print("Gallons: ");
            double gallons = scan.nextDouble();
           
            double milesPerGallon = (finalMiles - initialMiles) / gallons;
            System.out.println("Miles per Gallon: " + milesPerGallon + "\n");
        }
    }
}
