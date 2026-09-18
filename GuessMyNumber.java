import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {	
	public static void main(String[] args) { 
	Random random = new Random();
	int randomNumber = random.nextInt(100) ;
	System.out.println("I have a number between 1 and 100");
	System.out.println("Can you guess it!");
	System.out.print("Type a number:");
	Scanner in = new Scanner(System.in);
	int guess = in.nextInt();
	System.out.println("Your guess was:"+ guess);
	System.out.println("The number is " + randomNumber);
	
	}
}
