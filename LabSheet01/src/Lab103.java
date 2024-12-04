import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab103 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        String totalMinutes = JOptionPane.showInputDialog(null, "Input Time Parking (minute)", "Input", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(totalMinutes);
        
        int hours = input / 60;
        int minutes = input % 60;
        int priceInBaht = hours * 50; 
        int priceInSatang = minutes * 25; 
        double priceBaht = priceInBaht + priceInSatang / 100; 
        double priceSatang = priceInSatang % 100;
        double totalprice = priceBaht + (priceSatang / 100);
       
        JOptionPane.showMessageDialog(null, "Your Parking " + hours + 
        		" Hour " + minutes + " Minute. " + 
        		"\nAmount to be paid is " + totalprice + " baht.", "Message" , JOptionPane.INFORMATION_MESSAGE);
       
        
       
        scanner.close();

	}

}