
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestPolygon{
public static void main(String[] args) {
	
	//InputStreamReader isReader = new InputStreamREader(System.in)
	Scanner scannerln = new Scanner(System.in);
	
	System.out.println("Enter the Number of Sides of your Polygon");
	
	int polySides = scannerln.nextInt();
	
	System.out.println("Enter the Side Length of your Polygon");
	
	double polyLength = scannerln.nextDouble();
	
	System.out.println("Enter the X Coord for your Polygon");
		
	double polyX = scannerln.nextDouble();
	
	System.out.println("Enter the Y Coord for your Polygon");
	
	double polyY = scannerln.nextDouble();
	
	System.out.println("Enter the Apothem for your Polygon");
	
	double apoth = scannerln.nextDouble();
	

	
	Polygon poly1 = new Polygon(polySides, polyLength, polyX, polyY, apoth);
	int p1Sides = poly1.getNumSides();
	double p1Length = poly1.getSideLength();
	double p1X = poly1.getxCoord();
	double	 p1Y = poly1.getyCoord();
	double p1Apoth = poly1.getApothem();
	double p1prim = poly1.calculatePrim(polySides, polyLength);
	
	System.out.println("\n **Output** \n");
	System.out.println(poly1.toString());
	System.out.println("getNumSides() : " + p1Sides);
System.out.println("getSideLength(): " + p1Length);
System.out.println("getXCoord(): " + p1X);
System.out.println("getYCoord(): " + p1Y);
System.out.println("getApothem(): " + p1Apoth);
System.out.println("getPerimeter(): " + p1prim);
	
	System.out.println(poly1.getArea(p1prim, p1Apoth));
}
}