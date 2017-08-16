import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * Conversion Project:
 * This assignment asks the user to enter a 
 * distance in meters and then select 
 * what they would like to convert it too.
 * 
 */
public class ConversionProject {

	public static void main(String[] args) {
		// Declare variables
		int choice;
		
		// Instance of scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a distance in meters: ");
		double meters = input.nextDouble();
			
		// While loop
		do {
			System.out.println("1.  Convert to kilometers");
			System.out.println("2.  Convert to inches");
			System.out.println("3.  Convert to feet");
			System.out.println("4.  Quit the program");

			System.out.println("Enter your choice: ");
			choice = input.nextInt();

			// Decision structure
			if (choice == 1){
				convertToKilometers(meters);
			}
			else
				if (choice == 2){
					convertToInches(meters);
				}
				else
					if (choice == 3){
						convertToFeet(meters);
					}
					else
						if (choice == 4){
							System.out.println("Goodbye.");
						}
						else
							System.out.println("Invalid Selection.");
		} while (choice != 4);  //  End While loop

	}  // End Main
	
	// Convert to kilometers method
	public static void convertToKilometers(double num1){
		double kilometers = num1*0.001;
		System.out.println(num1 + " meters is " + kilometers + " kilometers.");
	}
	
	// Convert to inches method
	public static void convertToInches(double num1){
		double inches = num1*39.37;
		System.out.println(num1 + " meters is " + inches + " inches.");
	}
	
	// Convert to feet method
		public static void convertToFeet(double num1){
			double feet = num1*3.281;
			System.out.println(num1 + " meters is " + feet + " feet.");
		}
}  //  End Class
