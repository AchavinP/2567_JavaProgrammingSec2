import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit:"));
		double totalPriceofProduct = productUnit * productPrice;
		double totalwithVat = totalPriceofProduct + (totalPriceofProduct * 7/100);
		String frmtotalpriceofproduct = String.format("%,.2f",totalPriceofProduct);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		//display by dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "+frmtotalpriceofproduct
				+" baht."+
				"\nAdd Vat7% is "+ frmtotalwithVat + " baht.");
		//vat 7%
		
	}

}
