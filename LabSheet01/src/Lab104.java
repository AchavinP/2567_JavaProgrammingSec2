package Labsheet;
import javax.swing.JOptionPane;


public class Lab04 {
	
	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application", "Message", JOptionPane.INFORMATION_MESSAGE);
	 
	
		String nameInput = JOptionPane.showInputDialog(null, "Enter employee name", "Input", JOptionPane.QUESTION_MESSAGE);
		String hourInput = JOptionPane.showInputDialog(null, "Enter total hours for this employee.", "Input", JOptionPane.QUESTION_MESSAGE);
		double hour = Double.parseDouble(hourInput);
		double wage = 7.5;
		double earning = hour * wage ;
		double taxrate = 0.15;
		double Tax = taxrate * earning;
		double nete = earning - Tax;
		JOptionPane.showMessageDialog(null, "Employee name: " + nameInput +
				"\nHours worked: " + hourInput + 
				"\nHourly wage: " + "$ " + wage +
				"\nGross earning: " + "$ " + earning + 
				"\nTax rate: " + taxrate +
				"\nTax: " + "$ " + Tax +
				"\nNet earning: " + "$ " + nete
				, "Message", JOptionPane.INFORMATION_MESSAGE);
		
	}
}