

public class TestPoint{
public static void main(String[] args) {

Point p1 = new Point(1.0, 1.0, 1.0);

Point p2 = new Point();

double p1X = p1.getX();

double p1Y = p1.getY();

double p1Z = p1.getZ();

System.out.println("p1 values from getX(), getY() , getZ is: " + p1X + "," + p1Y + "," + p1Z);


double p2X = p2.getX();
double p2Y = p2.getY();
double p2Z = p2.getZ();

System.out.println("p2 values from getX(), getY(), getZ is: " + p2X + "," + p2Y + "," + p2Z);

double distance = p1.getDistance(p1, p2);
System.out.println("Distance between p1 and p2 is: " + distance);

double newX = 2.0;
double newY = 2.0;
double newZ = 2.0;

p1.setX(newX);
p1.setY(newY);
p1.setZ(newZ);

distance = p1.getDistance(p1, p2);

System.out.println("New Distance between p1 and p2 is: " + distance);

System.out.println( p1.toString());
System.out.println(p2.toString());
}
}