import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input product Name	: ");
		String productName = input.nextLine();
		System.out.print("Input product unit	: ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit	: ");
		double productprice = input.nextDouble();
		System.out.println("------------------------------------------");
		double totalprice = productUnit * productprice;
		String frmtotalprice = String.format("%,.2f",totalprice);
		System.out.println("Total Price is " + frmtotalprice + " baht.");
		System.out.println("------------------------------------------");
		System.out.print("How many Discount (%) : ");
		int discount = input.nextInt();
		System.out.println("------------------------------------------");
		double discountfrom = totalprice  * ( discount /100.0) ;
		double paidamount = totalprice - discountfrom;
		String frmdiscountfrom = String.format("%,.2f",discountfrom);
		String frmpaid = String.format("%,.2f",paidamount);
		System.out.println("Discount from " + discount + "%" + "\t" + frmdiscountfrom + " baht.");
		System.out.println("Amount to be paid \t" + frmpaid + " baht.");
		
		
		input.close();
		
		
	}

}
