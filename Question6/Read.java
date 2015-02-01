import java.io.Console;

import java.util.*;

public class Read{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				if(sc.hasNextInt()){
					System.out.println(sc.nextInt());
				}
			}
	}
}