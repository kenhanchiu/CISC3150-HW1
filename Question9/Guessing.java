import java.io.Console;

//for Random
import java.util.*;

public class Guessing{
	public static void main(String[] args){
		Random number = new Random();
		int n = number.nextInt(100)+1;
		System.out.println("The number is between 1 and 100!");
		Console c = System.console();
		String a = c.readLine("Please enter your guess!");
		int guess = Integer.parseInt(a);
		while(guess!=n){
			if(guess>n){
				System.out.println("Guess is higher than secret number!");
				a = c.readLine("Please enter your guess!");
				guess = Integer.parseInt(a);
			}
			if(guess<n){
				System.out.println("Guess is lower than secret number!");
				a = c.readLine("Please enter your guess!");
				guess = Integer.parseInt(a);
			}
		}
		if(guess==n){
			System.out.println("Horay!");
		}
	}
}