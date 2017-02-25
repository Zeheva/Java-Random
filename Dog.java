/*

File: Dog.java
Author: BHollingsworth
Date: 1FEB17
Purpose: This program demonstrates the use of  a simple class with a 
constructor, two methods and two private fields at a min. 

*/


public class Dog{

//private fields
	private String name;
	private String color;
	private int age;
	
	//setter method
	public void setName(String newName){
		name = newName;
	}
	
	//setter method
	public void setColor(String newColor){
		color = newColor;
	}
	
	//setter method
	public void setAge(int newAge){
		age = newAge;
	}
	
	//constructor
	public Dog(String dogName){
		name = dogName;
	}
	
	// overloaded constructor
	public Dog(String dogName, String dogColor){
		name = dogName;
		color =dogColor;
	}
	
	// overloaded constructor
	public Dog(String dogName, String dogColor, int dogAge){
		name = dogName;
		color = dogColor;
		age = dogAge;
	}
		
		//method to get dog info (may need to modify based on overlaoded constructors)
	public String dogInfo(){
	String info = ("Your dogs name is: " + name + "\nYour dogs color is: " + color + "\nYour dogs age is: " + age);
	return info;
	}
	
	// method with ternary operator
	public String barkAge(){
		
		String speak = (age <=0) ? ("I dont have an age yet") : ("Arf arf I am" + age + "years old");
		return speak;
		
	}
}
		
			
		










