/*
File: MyStandardIO.java
Author: BHollingsworth
Date: 18JAN17
Purpose: This program will test ablity to use standardIO
*/
import java.util.Scanner;

public class MyStandardIO
{
	public static void main(String[] arg)
	{
		byte myByte = 0; //age
		float myFloatLat = 0.0f; // latitude
		float myFloatLon = 0.0f; // longitude
		long myLong = 0L; // number of stars
		short myShort = 0; //max number for short in java
		boolean myBool = true; //Are you stressed out
		
		Scanner readLineIn = new Scanner(System.in);
		
		System.out.println("Enter your latitude");
		
		
		myFloatLat = readLineIn.nextFloat();
		
		System.out.println("Enter your longitude");
		
		myFloatLon = ReadLineIn.nextFloat();
		
		System.out.println("Your Latitued is " + myFloatLat);
		System.out.println("Your Longitude is " + myFloatLon);
		
		System.out.println("Enter what you think is the approximate number of stars in our galaxy");
		myLong = readLineIn.nextLong();
		System.out.println("You think there are only: " + myLong + " Stars?");
		
	
		
		
		
		
		
		
		
	}
		
		
		
		
		
}
		