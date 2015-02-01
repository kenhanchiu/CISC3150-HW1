import java.io.Console;

public class Lottery{
	public static void main(String[] args){
		Console c = System.console();
		int digit1 = 3;
		int digit2 = 4;
		int digit3 = 7;
		String a = c.readLine("Please enter the first digit!");
		int d1 = Integer.parseInt(a);
		String b = c.readLine("Please enter the second digit!");
		int d2 = Integer.parseInt(b);
		String d = c.readLine("Please enter the third digit!");
		int d3 = Integer.parseInt(d);
		if(digit1==d1 && digit2==d2 && digit3 ==d3){
			System.out.println("You won $10,000!");
			System.exit(0);
		}
		if((digit1==d2 || digit1==d3) && (digit2==d1 || digit2==d3) && (digit3==d1 || digit3==d2)){
			System.out.println("You won $3000!");
			System.exit(0);
		}
		if(digit1==d1 || digit1==d2 || digit1 == d3 || digit2==d1 || digit2==d2 || digit2 == d3 || digit3==d1 || digit3==d2 || digit3 == d3){
			System.out.println("You won $1000!");
			System.exit(0);
		}
	}
}