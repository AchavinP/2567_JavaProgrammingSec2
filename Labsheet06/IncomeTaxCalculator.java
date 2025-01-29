public class IncomeTaxCalculator {

    private double income = 0.0;

    public void setIncome(double inputIncome){
        income = inputIncome;
    }

    public double calculateTax(){
        double tax = 0.0;

        if (income < 0) {
            tax = -1.0;
        } else if (income <= 150000) {
            tax = 0.0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.05;
        } else if (income <= 500000) {
            tax = (150000 * 0.05) + ((income - 300000) * 0.10);
        } else {
            tax = (150000 * 0.05) + (200000 * 0.05) + ((income - 500000) * 0.20);
        }

        return tax;
    }
    public void displayTaxDetails(){
        System.out.printf("Income: %.1f\nTax: %.1f", income , calculateTax());
    }
}
