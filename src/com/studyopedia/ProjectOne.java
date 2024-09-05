package com.studyopedia;

import java.time.LocalDate; // To get current year

import java.util.Scanner; // Input from user library

public class ProjectOne {

	public static void main(String[] args) {
		// Input object declared
		Scanner scanner = new Scanner(System.in);
		int x = 11;
		
//		loop count down from x (Declared number) to 0
		for (int i = x; i >= 0; i-- ) {
//			Print count down from x down to 0
			System.out.println(i);
		}
		
		
//		2. 2 methods 
//		2a. Average 2 numbers 
		
		// Error handling and precondition
		int firstNumber = 0;
		int secondNumber = 0;
		
		boolean check = false; // Verification it completes the check of input numbers are valid
		
		
		while (!check) {
		
		try {
			System.out.print("Enter your first positive whole number: ");
			 firstNumber = scanner.nextInt();
			System.out.print("Enter your second positive whole number: ");
			 secondNumber = scanner.nextInt();
			 
			 // if both inputs are also above 0 (positive) then check is true and return
			 if (firstNumber > 0 && secondNumber > 0) {
				check = true; // Equate to true
			 }
		} catch(Exception e) {
			System.out.println("Must enter a valid input!");
			scanner.nextLine(); // Clear in case invalid input, else it will infinitely run the loop
		} 
	}
		
		// if check is true, then call the function with valid numbers
		if (check) {
		int average = averageTwoNumbers(firstNumber, secondNumber);
		System.out.print("Average is: " + average +"\n"); 
		}
		
//		2b. Find age of student given year of birth
		
		System.out.print("Enter your birth year! ");
		int studentBirthYearInput = scanner.nextInt(); // Student input
		
		// if student birth year is above 0 and not negative, then call the ageFinder function
		if (studentBirthYearInput > 0) {
			int studentAge = ageFinder(studentBirthYearInput);
			System.out.print("Student Age: " + studentAge);
		}

	}
	
	

//	Average 2 numbers function
	public static int averageTwoNumbers(int a, int b) {
		
		int total = a + b; // Add both numbers
		
		int average = total/2; // Divide by 2 for average 
		
		return average; // Return Average
		
	}
	
	
	// Student age finder function
	public static int ageFinder(int studentBirthYear) {
		// Getting current year via LocalDate() method
		int currentYear = LocalDate.now().getYear();
		
		// Compute current year from given year called
		int studentAge = currentYear - studentBirthYear;
		
		return studentAge;
	}

}
