public class LoanCalculator {

    private String productName;
    private double price;
    private double interestRate;
    private int years;

    public void setLoanDetails(String inputProductName, double inputPrice, double intputInterestRate, int intputYears){

        productName = inputProductName;
        price = inputPrice;
        interestRate = intputInterestRate;
        years = intputYears;

    }
    public double calculateMonthlyPayment(){
        double monthlyRate = (interestRate / 100.0) / 12;
        int totalMonths = years * 12;
        return (price * monthlyRate * Math.pow(1.0 + monthlyRate, totalMonths)) /
                (Math.pow(1.0 + monthlyRate, totalMonths) - 1.0);
    }
    public void displayLoanDetails(){
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Period: " + years + " years");
        System.out.printf("Monthly Payment: %.2f", calculateMonthlyPayment());
    }

}
