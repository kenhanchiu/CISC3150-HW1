import java.io.Console;

import static java.lang.Math.*;

public class Triangle{
	public static void main(String[] args){
		Console c = System.console();
		String Point1x = c.readLine("Please enter the x coordinate of Point 1!");
		double p1x = Double.parseDouble(Point1x);
		String Point2x = c.readLine("Please enter the x coordinate of Point 2!");
		double p2x = Double.parseDouble(Point2x);
		String Point3x = c.readLine("Please enter the x coordinate of Point 3!");
		double p3x = Double.parseDouble(Point3x);
		String Point1y = c.readLine("Please enter the y coordinate of Point 1!");
		double p1y = Double.parseDouble(Point1y);
		String Point2y = c.readLine("Please enter the y coordinate of Point 2!");
		double p2y = Double.parseDouble(Point2y);
		String Point3y = c.readLine("Please enter the y coordinate of Point 3!");
		double p3y = Double.parseDouble(Point3y);
		double L1 = sqrt(pow((p1x-p2x),2)+pow((p1y-p2y),2));
		double L2 = sqrt(pow((p1x-p3x),2)+pow((p1y-p3y),2));
		double L3 = sqrt(pow((p3x-p2x),2)+pow((p3y-p2y),2));
		if((L1+L2>L3) || (L3+L2>L1) || (L1+L3>L2)){
			System.out.println("It is a triangle!");
		}
		else{
			System.out.println("It is not a triangle!");
		}
	}
}