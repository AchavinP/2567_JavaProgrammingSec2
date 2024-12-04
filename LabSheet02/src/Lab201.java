import java.awt.JobAttributes;
import java.text.*;
import javax.swing.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));	
		double totalPrice = BUFFET * numberofCustomer;
		System.out.printf("Total price is %,.2f baht.",totalPrice);
		
		int isMember ;
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht." + 
					"\nDo you havea member card?");
		} while(isMember == JOptionPane.CANCEL_OPTION);
		if(isMember == JOptionPane.YES_OPTION) {
			double Priceafterdiscount = totalPrice * 0.90; 
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + Priceafterdiscount + " baht.");
		
		} else if (isMember==JOptionPane.NO_OPTION);{
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
		}
		
		
	}

}
