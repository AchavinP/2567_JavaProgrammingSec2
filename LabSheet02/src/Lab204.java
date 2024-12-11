package Labsheet;
import java.util.Scanner;

public class Lab204 {

	public static void main(String[] args) {
		Scanner inputnum = new Scanner(System.in);
        int numX;
        int numY;
        int Sum;
        
        System.out.print("Input value of X : ");
        numX = inputnum.nextInt();
        Sum = numX;
        System.out.print("Input value of Y : ");
        numY = inputnum.nextInt();
        
        while (numX > numY){
            System.out.print("Input value of Y, again : ");
            numY = inputnum.nextInt();
        }
        
        for (int i = numX+1;i <= numY;i++){
            System.out.println();
            System.out.print(Sum+" + "+ i +" = "+(Sum + i));
            Sum = Sum+i;
        }
	}

}