

public class Point{
	private double x;
	private double y;
	private double z;
	
	public Point (double px, double py, double pz){
	x = px;
	y = py;
	z = pz;
	}
	
	public Point(){
	x = 0.0;
	y = 0.0;
	z = 0.0;
	}
	
	public void setX(double px){
	x = px;
	}
	
	public void setY(double py){
	y = py;
	}
	
	public void setZ(double pz){
		z = pz;
	}
	
	public double getX(){
	return x;
	}
	
	public double getY(){
	return y;
	}
	
	public double getZ(){
		return z;
	}
	
	public double getDistance(Point p1, Point p2){
	double deltaX = Math.abs(p1.getX() - p2.getX());
	double deltaY = Math.abs(p1.getY() - p2.getY());
	double deltaZ = Math.abs(p1.getZ() - p2.getZ());
	double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY + deltaZ*deltaZ);
	return distance;
	}
	
	public String toString() {
	String str = "(" + x + "," + y + ")";
	return str;
	}
	
	
	
	
	}
	
	