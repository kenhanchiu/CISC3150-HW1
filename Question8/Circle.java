import java.io.Console;

import static java.lang.Math.*;

public class Circle{
	public static void main(String[] args){
		Console c = System.console();
		String Point1x = c.readLine("Please enter the x coordinate of Point 1!");
		double p1x = Double.parseDouble(Point1x);
		String Point1y = c.readLine("Please enter the y coordinate of Point 1!");
		double p1y = Double.parseDouble(Point1y);
		String Point1r = c.readLine("Please enter the radius of Point 1!");
		double p1r = Double.parseDouble(Point1r);
		String Point2x = c.readLine("Please enter the x coordinate of Point 2!");
		double p2x = Double.parseDouble(Point2x);
		String Point2y = c.readLine("Please enter the y coordinate of Point 2!");
		double p2y = Double.parseDouble(Point2y);
		String Point2r = c.readLine("Please enter the radius of Point 2!");
		double p2r = Double.parseDouble(Point2r);
		double L = sqrt(pow((p1x-p2x),2)+pow((p1y-p2y),2));
		if(p1r+p2r==L){
			System.out.println("The circles are touching each other!");
		}
		if(p1r+p2r>L){
			System.out.println("The circles are overlapping each other!");
		}
		if(p1r+p2r<L){
			System.out.println("The circles are separate from each other!");
		}
	}
}