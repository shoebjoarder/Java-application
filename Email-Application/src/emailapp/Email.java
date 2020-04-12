package emailapp;

import java.util.Scanner;

public class Email {
	private String lastName;
	private String firstName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "saj.com";
	
	// Constructor to receive the first and last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);		// commented after showInfo function
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);		// commented after showInfo function
		
		// Call a method that returns a random password
		this.password = randomPassword (defaultPasswordLength);
		System.out.println("Suggested password:	" + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is " + email);		// commented after showInfo function
	}
	
	// Ask for the department
	private String setDepartment () {
		System.out.print("Welcome " + firstName + "! Enter your department code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "development";}
		else if (depChoice == 3) {return "accounting";}
		else {return "";}
	}
		
	// Generate a random password
	private String randomPassword (int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSRUVWXYZ0123456789";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			//System.out.println(rand);
			//System.out.println(passwordSet.charAt(rand));
		}
		return new String(password);
		
	}
	
	// Set up the mailbox capacity
	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity () { 
		return mailboxCapacity; 
	}
	
	public String getAltEmail () {
		return alternateEmail;
	}
	
	public String getPassword () {
		return password;
	}
	
	public String showInfo () {
		return "Display name:		" + firstName + " " + lastName + 
				"\nCompany email:		" + email +
				"\nMailbox Capacity:	" + mailboxCapacity + "mb";
	}
}
