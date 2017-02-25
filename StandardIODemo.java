/*

File: StandardIODemo.java
Author: BHollingsworth
Date: 16JAN17
Purpose: This program demonstrates the use of Standard I/O
Classes including the BufferedReader and Scanner Classes.

*/

// Import required java classes
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardIODemo
{
		public static void main(String[] args) throws IOException
		{
			//variables to hold values
			int favInt =0;
			double favDouble = 0.0;
			int secondfavInt = 0;
			double secondfavDouble = 0.0;
			boolean myBoolean = false;
			short myShort = 0;
			
			//Define a inputStreamREader base on Standard Input (System.in)
			InputStreamReader isReader = new InputStreamReader(System.in);
			
			// Send the InputStreamReader to a BufferedReader
			BufferedReader stdin = new BufferedReader(isReader);
			
			//Prompt the user to enter an int
			System.out.println("Enter your favorite interger:");
			
			//The readLine() method reads everything entered 
			//However the Integer.parseInt() method converts the value to an int
			favInt = Integer.parseInt(stdin.readLine());
			
			//prompt the user to enter an double
			System.out.println("Enter your favorite double number:");
			
			//read the line and conver to tha double
			favDouble = Double.parseDouble(stdin.readLine());
			
			//Print the results to verify your data
			System.out.println("Your favorite int is: " + favInt);
			System.out.println("your favorite double is: " + favDouble);
			
			//Use the Scanner class to perform the same functionality
			Scanner scannerIn = new Scanner(System.in);
			
			//Prompt the user to enter another int
			System.out.println("Enter your second favorite int");
			
			//the nextIn() method scans the next int value
			secondfavInt = scannerIn.nextInt();
			
			//Prompt the user to enter another double
			System.out.println("Enter your second favorite double number:");
			
			//the nextDouble(*) method scans the next int value
			secondfavDouble = ScannerIn.nextDouble();
			
			//Prompt the user to enter a boolean
			System.out.println("Enter your favorite Boolean value:");
			
			//the nextBoolean() method scans the next boolean value
			myBoolean = scannerIn.nextBoolean();
			
			//prompt the user to input a short
			System.out.println("Enter your favorite short number:");
			
			//the nextShort() method scans the next short value
			myShort = ScannerIn.nextShort();
			
			//Print the results to verify your data
			System.out.println("Your second favorite int is: " + secondfavInt);
			System.out.println("Your second favorite double is: " + secondfavDouble);
			System.out.println("your favorite Boolean is: " + myBoolean);
			System.out.println("your favorite short is: " + myShort);
		}
}

		