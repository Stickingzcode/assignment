	import java.util.Scanner;

	public class Years {

	public static void main(String... args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        
        int minutes = scanner.nextInt();

        int years = minutes/ 525600;
        
        int days = (minutes % 525600)/1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
