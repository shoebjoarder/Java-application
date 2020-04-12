package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email1 = new Email("Allan", "Joarder");
		// email1.setAlternateEmail("aj@outlook.com");		// commented after showInfo function
		// System.out.println(email1.getAltEmail());		// commented after showInfo function
		System.out.println(email1.showInfo());

	}

}
