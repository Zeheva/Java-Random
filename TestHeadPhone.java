/*
File: TestHeadPhone.java
Author: BHollingsworth
Date: 18FEB17
Purpose: Tests the HeadPhone class from HeadPhone.java
*/
public class TestHeadPhone{
	
public static void main(String[] args) {
	//build the first headphone with default values
	HeadPhone mine = new HeadPhone();
	
	//build second headphone with overloaded constructor, all non instatiated fields will be null or default values.
	HeadPhone mine2 = new HeadPhone(1);
	//build Third headphone with overloaded constructor, all non instatiated fields will be null or default values.
	HeadPhone mine3 = new HeadPhone(2, "Apple");
	
	//print out information on headphone classes built. 
	System.out.println(mine.toString());
	
	System.out.println();
	
	System.out.println(mine2.toString());
	
	System.out.println();
	
	System.out.println(mine3.toString());
	
	
}
}