package studentdatabaseapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student stud1 = new Student();
		// Ask how many users needed to be added
		stud1.enroll();
		stud1.payTuition();
		System.out.println(stud1.showInfo());
		// Create n number of new students
		
	}

}
