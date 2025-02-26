import java.util.*;
import java.io.*;

public class Lab1101 {
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
	}// end of main
	
	public static void printHeader(int section) {
		System.out.println("**********************************************");
		System.out.println("\tList of Data for section " + section);
		System.out.println("**********************************************");
		
	}
	public static void displayStudentList(int sec) throws IOException{
		try(BufferedReader readFile=new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp="";
			while((temp = readFile.readLine())!=null) {
				String[] data = temp.split("\t");
				
				if(data.length < 6) continue; //ensure valid data format
				
				int studentSection = Integer.parseInt(data[3]);
				
				if(studentSection==sec) {
					double midTerm = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					
					System.out.printf("%s %s\t%.2f\t%.2f \t%s%n",data[0],data[2],midTerm,finalScore
							,determineResult(midTerm,finalScore));
					
				}
			}
			
		}
	}
	public static String determineResult(double mid,double fin) {
		return(mid+fin)<=40?"Fail":"Pass";
	}
}
