package java_lab9;
import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		int choice = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch","run program",  JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.NO_OPTION) {
		Product sold = new Product();
		String input = JOptionPane.showInputDialog(null, "Input the number of product :");
		int unit = Integer.parseInt(input);
		sold.setUnit(unit);
		JOptionPane.showMessageDialog(null, sold.toSring());
		}
		else {
			PattanakarnBranch sold = new PattanakarnBranch();
			String input = JOptionPane.showInputDialog(null, "Input the number of product :");
			int unit = Integer.parseInt(input);
			sold.setUnit(unit);
			JOptionPane.showMessageDialog(null, sold.toString());

		}
	}

}
