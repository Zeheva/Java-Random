/*
File: HomeworkOne.java
Author: BHollingsworth
Date: 18JAN17
Purpose: This program will take in three quiz scores and return a value; 
convert months to years;
convert temp from Celsius to Fahereheit;
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class HomeworkOne{
	public static void main(String[] args){
		//Variables to hold values
		int studentId = 0;
		double quiz1 = 0.0;
		double quiz2 = 0.0;
		double quiz3 = 0.0;
		double avg = 0.0;
		int months = 0;
		int years = 0;
		double celsius = 0.0;
		double fahrenheit = 0.0;
		final String DEGREE = "\u00b0";
		
			
		
		//Setting up Scanner class to pull data from user
		Scanner scannerIn = new Scanner(System.in);
		
		//ask user for input
		System.out.println("Enter your your Student EMPLID");
		
		//Read the line and convert to Int
		studentId = scannerIn.nextInt();
		
		//ask user for input
		System.out.println("Enter your first Quiz score to be averaged");
		
		//Read the line and convert to double
		quiz1 = scannerIn.nextDouble();
		
		//ask user for input
		System.out.println("Enter your second Quiz score to be averaged");
		
		//Read the line and convert to double
		quiz2 = scannerIn.nextDouble();
		
		//ask user for input
		System.out.println("Enter your third Quiz score to be averaged");
		
		//Read the line and convert to double
		quiz3 = scannerIn.nextDouble();
		
		//Perform averaged function
		avg = (quiz1 + quiz2 + quiz3) / 3.0;
		
		DecimalFormat df = new DecimalFormat("###.##");
//double roundAvg = Math.round(avg * 100.0) / 100.0;
		
		//ask user for input
		System.out.println("Enter your age in months to find out how many years old you are");
		
		//Read the line and convert to Int
		months = scannerIn.nextInt();
		
		//Perform averaged function
		years = months / 12;
		
		//ask user for input
		System.out.println("Enter the current Temperature in degrees Celsius");
		
		//Read the line and convert to float
		celsius = scannerIn.nextFloat();
		
		//Perform Temperature conversion
		fahrenheit = ((celsius * 1.8) + 32.0);
		
		//Print out to user results of inputs and calculations
		System.out.println("****Thank You****");
		System.out.println("Student EMPLID: " + studentId);
		System.out.println("Quiz 1 Score: " + quiz1);
		System.out.println("Quiz 2 Score: " + quiz2);
		System.out.println("Quiz 3 Score: " + quiz3);
		System.out.println("Average quiz Score: " + df.format(avg));
		System.out.println("Age in months: " + months);
		System.out.println("Age in years: " + years);
		System.out.println("Temperature in Celsius: " + celsius + DEGREE);
		System.out.println("Temperature in Fahrenheit: " + fahrenheit + DEGREE);
	}
		
}
		