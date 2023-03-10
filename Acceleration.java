import java.util.Scanner;

public class Acceleration{
	public static void main (String... args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Initial velocity: ");
		int initialVelocity = scan.nextInt();

		System.out.print("Enter final velocity: ");
		int finalVelocity = scan.nextInt();

		System.out.print("Enter time: ");
		int time = scan.nextInt();
		
		double velocity = (finalVelocity - initialVelocity) / time ;
		
		System.out.print(velocity);
	}
}
