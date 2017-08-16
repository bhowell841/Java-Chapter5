import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * Retail Price Calculator:
 * User will enter the an item's wholesale cost
 * and its markup percentage.  The program will 
 * then display the retail price
 */
public class RetailPriceCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the wholesale cost of the item: ");
		double wholesale = input.nextDouble();
		System.out.println("What is the markup percentage: ");
		double markup = input.nextDouble();
		
		double retail = calculateRetail(wholesale, markup);
		System.out.printf("The retail price is $%.2f", retail);

	}  //  End Main

	public static double calculateRetail(double num1, double num2){
		double retail = num1 + (num1*(num2/100));
		return retail;
		
	}
	
}  // End Class
