package Labsheet;
import java.util.*;

public class Lab208 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int salary, age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;

        System.out.print("Enter the monthly sathly: $");
        salary = input.nextInt();
        System.out.print("Enter the age: ");
        age = input.nextInt();

        contributableSalary = (salary <= SALARY_CEILING) ? salary : SALARY_CEILING;
        
        if (age <= 55) {
            employeeContribution = EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            employeeContribution = EMPLOYEE_RATE_55_TO_60;
            employerContribution = EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            employeeContribution = EMPLOYEE_RATE_60_TO_65;
            employerContribution = EMPLOYER_RATE_60_TO_65;
        } else {
            employeeContribution = EMPLOYEE_RATE_65_ABOVE;
            employerContribution = EMPLOYER_RATE_65_ABOVE;
        }

        totalContribution = (employeeContribution*contributableSalary)+(contributableSalary*employerContribution);
        System.out.printf("The employee's contribution is: $%.2f\n", (contributableSalary*employeeContribution));
        System.out.printf("The employee's contribution is: $%.2f\n", (employerContribution*contributableSalary));
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
        input.close();

	}

}