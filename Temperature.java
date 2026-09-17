
import java.util.Scanner;

public class Temperature {	
	public static void main(String[] args) { 
	System.out.print("Enter a temperature in Celsius: "); 
	Scanner in = new Scanner(System.in);
	double line  = in.nextDouble();
	double C = line;
	double F = C*1.8+ 32;
	System.out.print(C+" C"+" = "+ F+ "F");
	}
}
	
	
