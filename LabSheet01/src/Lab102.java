import java.util.*;
import java.text.*;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minutesinput = input.nextInt();
		int minutes = minutesinput/60;
		int minutesday = minutes/24;
		int year = minutesday / 365;
		int day = minutesday % 365;
		
		System.out.print(minutesinput + " minutes is approximately " + year + " years and " + day + " days");
		
		
		
		
		input.close();
	}

}
