package java_Lab10;

import javax.swing.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog("Enter Drink type (1: Hot, 2: Cold):"));
        int coffeeType = Integer.parseInt(JOptionPane.showInputDialog("Enter Coffee type (1: Americano, 2: Espresso, 3: Cappuccino):"));
        char sizeCoffee = JOptionPane.showInputDialog("Enter Coffee size (S, T, G, V):").toUpperCase().charAt(0);
        int baristaChoice = Integer.parseInt(JOptionPane.showInputDialog("Choose Barista (1: Leon, 2: Claire):"));
        
        Barista selectedBarista;
        if (baristaChoice == 1) {
            selectedBarista = staff1;
        } else {
            selectedBarista = staff2;
        }
        
        Coffee order = new Coffee(drinkType, sizeCoffee, coffeeType, selectedBarista);

        JOptionPane.showMessageDialog(null,order.toString()+
        		"\nBarista: "+selectedBarista.getName()+" ("+selectedBarista.getGender()+")");
	}

}