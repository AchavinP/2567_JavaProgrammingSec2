public class UtilityBillCalculator {

    private double electricityUsage;
    private double waterUsage;

    public void setUsage(double InputelectricityUsage, double InputwaterUsage){

        electricityUsage = InputelectricityUsage;
        waterUsage = InputwaterUsage;

    }
    public double calculateElectricityBill(){
        double electricityBill = 0.0;

        if (electricityUsage <= -1){
            electricityBill = electricityUsage;
        } else if (electricityUsage <= 50) {
            electricityBill = electricityUsage * 1.50;
        } else if (electricityUsage <= 150) {
            electricityBill = (50 * 1.50) + ((electricityUsage - 50) * 2.50);
        } else {
            electricityBill = (50 * 1.50) + (100 * 2.50) + ((electricityUsage - 150) * 3.00); }

        return electricityBill;
    }
    public double calculateWaterBill(){
        double waterBill = 0.0;

        if (waterUsage <= -1){
            waterBill = waterBill;
        } else if (waterUsage <= 30){
            waterBill = waterUsage * 10;
        } else { waterBill = (30 * 10.0) + ((waterUsage - 30) * 15.0); }

        return waterBill;
    }
    public void displayBillDetails(){
        System.out.printf("Electricity Usage: %.1f units" +
                        "\nElectricity Bill: %.1f THB" +
                        "\nWater Usage: %.1f units" +
                        "\nWater Bill: %.1f THB"
                ,electricityUsage, calculateElectricityBill(), waterUsage, calculateWaterBill());
    }
}
