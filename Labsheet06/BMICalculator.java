public class BMICalculator {

    private double weight;
    private double height;

    public void setDetails(double inputWeight, double inputHeight){
        weight = inputWeight;
        height = inputHeight;

    }
    public double calculateBMI(){
        return weight / (height * height );
    }
    public String getBMICategory(){
        double sumBMI = calculateBMI();
        String stBMI = "";
        if (sumBMI <= 0) { stBMI = "Spirit"; }
        else if (sumBMI <= 18.5) { stBMI = "Underweight"; }
        else if (sumBMI <= 24.9) { stBMI = "Normal weight"; }
        else if (sumBMI <= 29.9) { stBMI = "Overweight"; }
        else { stBMI = "Obese"; }

            return stBMI;
    }
    public void displayBMIDetails(){
        System.out.printf("Weight: %.1f kg" +
                        "\nHeight: %.2f m" +
                        "\nBMT: %f " +
                        "\nCatrgory: %s", weight , height , calculateBMI() , getBMICategory());
    }
}
