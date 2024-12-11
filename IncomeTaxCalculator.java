package Labsheet;
import java.util.*;

public class Lab207 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        final double taxrate20k = 0.1;
        final double taxrate40k = 0.2;
        final double taxrate60k = 0.3;
        int taxIncome;
        double taxPayable;
        
        System.out.print("Enter the taxable income: $");
        taxIncome = input.nextInt();
        
        if (taxIncome <= 20000) {
            taxPayable = 0.0;
        }
        else if (taxIncome <= 40000){
            taxPayable = (taxIncome - 20000)*taxrate20k;
        }
        else if (taxIncome <= 60000){
            taxPayable = (20000*taxrate20k)+(taxIncome-40000)*taxrate40k;
        }
        else {
            taxPayable = (20000*taxrate20k)+(20000*taxrate40k)+(taxIncome-60000)*taxrate60k;
        }
        
        System.out.printf("The income tax payable is: $%.2f\n", taxPayable);

        input.close();
	}

}