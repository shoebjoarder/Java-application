package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many users needed to be added
		System.out.print("Enter number of students you want to enroll: ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		Student[] student = new Student[numberOfStudents];
			
		// Create n number of new students
		for(int n=0; n<numberOfStudents; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].payTuition();
			System.out.println(student[n].showInfo());
		}	
	}

}
