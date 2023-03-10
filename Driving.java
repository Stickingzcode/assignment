	import java.util.Scanner;

	public class Driving{
	
	public static void main(String...args) {
	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        
        double distance = scanner.nextDouble();

        System.out.println("Enter the miles per gallon ");
        
        double milesPerContainer = scanner.nextDouble();

        System.out.println("Enter the price per gallon: ");
        
        double pricePerGallon = scanner.nextDouble();

        double costOfDrive = (distance / milesPerContainer) * pricePerGallon;

        System.out.println("The cost of driving is $" + costOfDrive);
    }
}
