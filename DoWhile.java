/*

File: DoWhile.java
Author: BHollingsworth
Date: 25JAN17
Purpose: This program demonstrates the use of Do-While operations;

*/

public class DoWhile
{
		public static void main(String[] args){
			//sets array values
		int array[] = {2,3,4,5,6,34,3,2,3,4};
		//sets value of i to represent the array index
		int i = 0;
		
		//Do this action
		do{
			//print out the array by index
			System.out.println(array[i]);
			//add one to index
			i++;
			//if elelment 34 is found in the array break out of do-while loop
			if (array[i] == 34){
				break;
			}
			//as long as index is less then 10 start again
		}while (i<10);
		
			
	}
	
}	