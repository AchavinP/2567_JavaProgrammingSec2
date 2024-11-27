import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		DecimalFormat frm= new DecimalFormat("#,###.00");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productprice = input.nextFloat();
		System.out.println();
		float totalPriceofProduct = productUnit * productprice;
		System.out.println("Total Price is " + frm.format(totalPriceofProduct)
				+" baht.");
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct * 7/100);
		System.out.println("Add VAT 7% is "+ frm.format(totalwithVat) + " baht.");
		System.out.println();
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7%% is "+ frmtotalwithVat + " baht.");
		System.out.println("Output using printf");
		System.out.printf("Add VAT 7%% is %,.2f ", frmtotalwithVat);
		input.close();
	}

}
