import javax.swing.*;

import java.awt.JobAttributes;
import java.util.*;
public class Lab205 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		//System.out.println(balance);
		int moneywithdraw = Integer.parseInt(JOptionPane.showInputDialog("your balance : " + balance + 
				"\nInput money to withdraw:")); 
		if (moneywithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more balance",
					"ERROR",JOptionPane.ERROR_MESSAGE);
			
		}else if (moneywithdraw>50000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			
		}else if (moneywithdraw%100!=0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw " + (moneywithdraw%100) + " baht." ,
					"Error",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "you withdraw " + moneywithdraw + " baht."+
					"\n1,000 = " + (moneywithdraw/1000) 
					+ "\n500 = " + (moneywithdraw%1000)/500 +
					"\n100 = " + (moneywithdraw%500)/100);
		}
	}

}
