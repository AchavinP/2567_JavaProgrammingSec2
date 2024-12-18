import javax.swing.*;

public class Lab401 {
	//main method
	public static void main(String[] args) {
		inputemail();
	}// end of main method
	
	public static void inputemail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			
			if(varEmail !=null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
				
			}else {
				JOptionPane.showMessageDialog(null, "Email cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address[y/Y]:");
			
			
			
			
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)?"Your e-mail is " + email 
						:"Your email is not a hotmail or gamil address." );
		
		
	}
	
	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/
		return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
	}

}
