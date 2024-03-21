import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Weight of Order: ");
            double weight = scan.nextDouble();

            if (weight <= 0) 
                System.out.println("bye");
                break;

            double shippingCost = calculateShippingCost(weight);
            System.out.println("Shipping Cost: $" + String.format("%.2f", shippingCost));
        }
    } public static double calculateShippingCost(double weight) {
        final double handlingFee = 3.00;
        final double freeShippingLimit = 10.0;
        final double perPoundRate = 0.25;

        double shippingCost = handlingFee;

        if (weight > freeShippingLimit) 
            shippingCost += (weight - freeShippingLimit) * perPoundRate;
        return shippingCost;
    }
}
