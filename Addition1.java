	import java.util.Scanner;
	
	public class Addition1 {
	
	public static void main(String... args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your first integer: ");
	
	int number1 = input.nextInt();
	
	System.out.print("Enter your second integer: ");
	
	int number2 = input.nextInt();
	
	int sum = number1 + number2; 
	
	System.out.printf("Sum is %d%n", sum );
	
	if (number1 > number2) {
	
	System.out.printf("we can subtract, \"number2\" from \"number1\", therefore: %d - %d%n", number1, number2) ;
	
	int sub = number1- number2;
	
	System.out.println(sub);
	
	}
	
	}
	
	
	}
