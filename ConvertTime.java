import java.util.Scanner;

public class ConvertTime {	
	public static void main(String[] args) { 
	System.out.print("Total number of seconds to hours, minutes, and seconds "); 
	Scanner in = new Scanner(System.in);
	int sec  = in.nextInt();
	int hours = sec/3600;
	int hoursecremaining = sec%3600;
	int mins = hoursecremaining/60;
	int minsremaining = hoursecremaining%60 ;
	int secsremaining = minsremaining%60 ;
	System.out.println("Hours:"+ hours);
	System.out.println("Mintues: "+ mins);
	System.out.println("Seconds: "+ secsremaining);
	}
}
