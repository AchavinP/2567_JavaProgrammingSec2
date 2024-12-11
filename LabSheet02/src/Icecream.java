package Labsheet;
import javax.swing.*;
import java.util.*;

public class Lab206 {

	public static void main(String[] args) {
		
		final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
        int numIceCream;
        
        String iceCream1 = "Vanilla";
        String iceCream2 = "Chocolate";
        
       
        numIceCream = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
                                                                        "\n[2] Chocolate Flavor 15 B." +
                                                                        "\nPress number to choose flavor:"));
       
        while (numIceCream != 1 && numIceCream != 2) {
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice!" +
                                               	"\nTry again...", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            numIceCream = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
                                                                        "\n[2] Chocolate Flavor 15 B." +
                                                                        "\nPress number to choose flavor:"));
        }

       
        int topping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?", "Topping", JOptionPane.YES_NO_OPTION);
        
      
        int iceCreamTotal = (numIceCream == 1) ? VANILLA : CHOCOLATE;
        String iceCreamFlavor = (numIceCream == 1) ? iceCream1 : iceCream2;
        
     
        int iceTopping = (topping == JOptionPane.YES_OPTION) ? iceCreamTotal + TOPPING : iceCreamTotal;
        
      
        String Message = (topping == JOptionPane.YES_OPTION) ? "And with topping" : "And no topping";
        JOptionPane.showMessageDialog(null, "You chose " + iceCreamFlavor + " Flavor " +
                                            "\n" + Message + 
                                            "\nTotal price = " + iceTopping + " baht.");
	}

}