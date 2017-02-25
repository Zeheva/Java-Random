

public class Polygon{

private int numSides = 4;

private double sideLength = 5.0;

private double xCoord = 0.0;

private double yCoord = 0.0;

private double apothem = 5.0;

private double perimeter = 20.0;


public int getNumSides(){
	return numSides;	
}
public void setNumSides(int numSides){
	this.numSides = numSides;
}

public double getSideLength(){
	return sideLength;	
}
public void setSideLength(double sideLength){
	this.sideLength = sideLength;
}


public double getxCoord(){
	return xCoord;
}
public void setxCoord(double xCoord){
	this.xCoord = xCoord;
}

public double getyCoord(){
	return yCoord;
}
public void setyCoord(double yCoord ){
	this.yCoord = yCoord;
}

public double getApothem(){
	return apothem;
}
public void setApothem(double theApothem){
	apothem = theApothem;
}

public double getPerimeter(){
	return perimeter;
}
public void setPerimeter(double perimeter){
	this.perimeter = perimeter;
}

public double calculatePrim(double numSides, double sideLength){
 double perimeter = (numSides * sideLength);
 return perimeter;
}
public void Polygon(){
}

public Polygon(int sidesNumber, double Length, double X, double Y, double theApothem){
	numSides = sidesNumber;
	sideLength = Length;
	xCoord = X;
	yCoord = Y;
	apothem = theApothem;
	
}

public double getArea(double perim, double apoth){
	double area = ( (perim / 2 )* apoth) ;
return area;
}

public String toString(){
	String outPut = ("toString():  (numsides= " + numSides + ", " + "sideLength = " + sideLength + ", " +
	"xcoord = " + xCoord + ", " + "ycoord = " + yCoord + ", " + "apothem = " + apothem + ")");
	return outPut;
}
}