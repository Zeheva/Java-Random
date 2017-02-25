/*

File: TestDog.java
Author: BHollingsworth
Date: 1FEB17
Purpose: Tests the Dog class from Dog.java

*/
public class TestDog{
public static void main(String[] args) {
	
	//build dogs to test overloaded constr
	Dog dog1 = new Dog("Spot", "Red", 10);
	
	Dog dog2= new Dog("Spot", "Red");
	
	Dog dog3= new Dog("Spot");
	
	//call methods
	System.out.println(dog1.dogInfo());
	
	System.out.println(dog1.barkAge());
	
	System.out.println("---------------------");
	
	System.out.println(dog2.dogInfo());
	
	System.out.println(dog2.barkAge());
	
	System.out.println("---------------------");
	
	System.out.println(dog3.dogInfo());
	
	System.out.println(dog3.barkAge());
}
}