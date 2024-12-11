import java.text.DecimalFormat;
import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		String Weightinput = JOptionPane.showInputDialog(null, 
		"Input Weight", "Input", JOptionPane.QUESTION_MESSAGE);
		 double weight = Double.parseDouble(Weightinput);
	     String heightinput = JOptionPane.showInputDialog(null, 
				 "Input Height", "Input", JOptionPane.QUESTION_MESSAGE);
	     double height = Double.parseDouble(heightinput);
	     String text = "";
	     double heightmeter = height/100;
	     double BMI = weight / (heightmeter * heightmeter);
	     if (BMI<18.5) {
	    	 text = "Underweight";
	     }
	     else if (BMI>18.5&&BMI<24.9) {
	    	 text = "Normal-weight";
	     }
	     else if (BMI>25.0&&BMI<29.9) {
	    	 text = "Overweight";
	     }
	     else if (BMI>=30.0) {
	    	 text = "Obesity";
	     }
	     JOptionPane.showMessageDialog(null, 
				 "BMI = " + BMI + 
				 "\nYou're " + text, "BMI", JOptionPane.WARNING_MESSAGE);
	}

}
