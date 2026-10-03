import java.util.Scanner;

public class WasteCalculator {

    // Method to calculate total waste
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at collection point 1: ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste at collection point 2: ");
        double point2 = sc.nextDouble();

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");

        sc.close();
    }
}