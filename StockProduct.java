import java.util.Scanner;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4]; 	
		for(int i=0; i<4;i++) {
			System.out.print("Input product Id	  : ");
			productList[i].setId(scan.nextLine());
			
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			scan.nextLine();
			space();
			
		}
		Line();
		
	}
	public static void space() {
		System.out.println("");
	}
	
	public static void Line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
