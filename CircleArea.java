import java.io.Console;
import static java.lang.Math.*;

public class CircleArea {
	public static void main(String[] args){
		Console c = System.console();
		while(true){
			String radius = c.readLine("Please enter the radius!");
			double r = Double.parseDouble(radius);
			double area = PI * pow(r,2);
			System.out.println("The area is: " + area);
			System.out.println();
		}
	}
}