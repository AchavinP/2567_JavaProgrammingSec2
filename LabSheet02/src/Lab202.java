import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number : ");
		int inputnumOne = input.nextInt();
		while (true) {
			System.out.print("Input number : ");
			int inputnumTwo = input.nextInt();
			
			if (inputnumTwo<inputnumOne) {
				break;
			}
			inputnumOne = inputnumTwo;
		}
		
		System.out.print("\nBYE BYE");
	}

}
