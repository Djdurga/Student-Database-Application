package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshers\n2 - Sophnore\n3 - Junior\n4 - Senior\nEnter student class level : ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	//	System.out.println(firstName + " " + lastName + " " + gradeYear + " " + StudentId);
	}
	
	//Generate an Id
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.StudentId =  gradeYear + "" + id;
		
	}
	
	
	//Enroll in course
	public void enroll() {
	//Get inside a loop, user hits 0
	do {	
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner in = new Scanner(System.in);
	    String course = in.nextLine();
	    if(!course.equals("Q")) {
	    	courses = courses + "\n   " + course;
	    	tuitionBalance = tuitionBalance + costOfCourse;
	    }
	    else {
	    //	System.out.println("BREAK!");
	    	break; }
	    
	} while(1 != 0);
	  //  System.out.println("ENROLLED IN: " +courses );
	  //  System.out.println("TUITION BALANCE: " +tuitionBalance);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: Rupees " +tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: rupees ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of rupees: " +payment);
		viewBalance();
	}
	
	//show status
	public String toString() {
		return "Name: " +firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + StudentId +
				"\nCourses Enrolled: " + courses +
				"\nBalance: Rupees " +tuitionBalance;
	}
	

}
