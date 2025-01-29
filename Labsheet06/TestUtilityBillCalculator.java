public class TestUtilityBillCalculator {
    public static void main(String[] args) {

        UtilityBillCalculator billCalculator = new UtilityBillCalculator();
        billCalculator.setUsage(200,40);

        billCalculator.displayBillDetails();

    }
}
