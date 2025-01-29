import java.util.*;
public class TestUtilityBillCalculatorInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UtilityBillCalculator user = new UtilityBillCalculator();
        System.out.print("Enter electricity usage (units): ");
        double InputelectricityUsage = input.nextDouble();
        System.out.print("Enter water usage (units): ");
        double InputwaterUsage = input.nextDouble();

        System.out.println();
        user.setUsage(InputelectricityUsage, InputwaterUsage);
        System.out.println("Bill Details: ");
        user.displayBillDetails();
        System.out.printf("\nTotal Bill: %.1f THB", (user.calculateElectricityBill())+ user.calculateWaterBill());
    }

}
