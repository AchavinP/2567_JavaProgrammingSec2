import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		int numberofStudent = scan.nextInt();

		scan.nextLine();
		//Create an array of Student objects
		Student[] students = new Student[numberofStudent]; 
		//input information for each student
		
		for(int i=0; i<numberofStudent;i++) {
			students[i] = new Student();
			System.out.print("\nINPUT INFORMATION OF STUDENT " + (i+1));
			Line();
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
		
			students[i].setName(scan.nextLine());
			while(true) {
				if(!students[i].checkScore()) {
					System.out.print("Input score, again: ");
				}
				else {
					System.out.print("Input student score: ");
				}
				
				int score = scan.nextInt();
				
				scan.nextLine();
				students[i].setScore(score);
				if(students[i].checkScore()) {
					
					break;
				}
				
				
			}
			System.out.println("\nLIST OF PASS STUDENTS (>=50:)");
			Line();
			for(Student student : students) {
				if(student.isPass()) {
					System.out.println(">> "+student.getName()+ " ("+student.getScore()+")" + "get grade "
				+ findGrade(numberofStudent));
				}
			}
			
		}
		
		
		scan.close();
	}
	public static void Line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static String findGrade(int score) {
		if (score >= 80) return "A";
		else if (score>=76) return "B+";
		else if (score>=70) return "B";
		else if (score>=66) return "C+";
		else if (score>=60) return "C";
		else if (score>=56) return "D+";
		else if (score>=50) return "D";
		else return "F";
	}
}
