package Labsheet;
import javax.swing.JOptionPane;

public class Lab05 {

	public static void main(String[] args) {
		
		String idnumInput = JOptionPane.showInputDialog(null, 
				"This program calculates the total cost of a CD order Please enter the ID of the CD", "Input", JOptionPane.QUESTION_MESSAGE);
		String cdnameInput = JOptionPane.showInputDialog(null, 
				"Please enter the title of the CD", "Input", JOptionPane.QUESTION_MESSAGE);
		String cdpriceInput = JOptionPane.showInputDialog(null, 
				"Please enter the price of the CD in U.S. dollars", "Input", JOptionPane.QUESTION_MESSAGE);
		String quanInput = JOptionPane.showInputDialog(null, 
				"Please enter the quantity to be purchased", "Input", JOptionPane.QUESTION_MESSAGE);
		int idnum = Integer.parseInt(idnumInput);
		int quancd = Integer.parseInt(quanInput);
		double priceUs = Double.parseDouble(cdpriceInput);
		double subtotal = quancd * priceUs;
		double taxrate = 6.25;
		double tax = subtotal * (taxrate / 100);;
		double totalprice = subtotal + tax;
		JOptionPane.showMessageDialog(null, "Summary of the transaction: \n" +
				"\nCD ID: " + idnum + 
				"\nCD Title: " + cdnameInput +
				"\nCD Unit Price: " + "$" + priceUs +
				"\nCD Quantity: " + quancd + 
				"\n\n" +
				"Subtotal: " + "$" +subtotal +
				"\nTax rate: " + taxrate + "%" +
				"\nTotal: " + "$" + totalprice +
				"\nEnd of Program"
				
				, "Message", JOptionPane.INFORMATION_MESSAGE);

	}

}
