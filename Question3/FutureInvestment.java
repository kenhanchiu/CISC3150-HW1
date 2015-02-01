import java.io.Console;

import static java.lang.Math.*;

public class FutureInvestment {
	public static void main(String[] args){
		Console c = System.console();
		String invest = c.readLine("Please enter the invest amount!");
		double IA = Double.parseDouble(invest);
		String rate = c.readLine("Please enter the annual interest rate!");
		double AIR = Double.parseDouble(rate);
		String years = c.readLine("Please enter the amount of years!");
		double Y = Double.parseDouble(years);
		System.out.println();
		System.out.println();
		double value = IA * pow((AIR+1),(Y*12));
		System.out.println("Your invest value is: " + value);
	}
}