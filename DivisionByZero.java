import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionByZero {

	int p = 9;
	int s = 10;
		
	int t=1212;
	long s = 3l;
	
	public static int quotient(int numerator,int denominator) throws ArithmeticException {
		return numerator/denominator;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueLoop = true;
		
		
		
		do {
			try {
				System.out.print("Enter numerator: ");
				int numerator = sc.nextInt();
				System.out.print("Enter denominator: ");
				int denominator = sc.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.println(result);
				
				continueLoop = false;
				
			}
			
			catch(InputMismatchException e) {
				sc.nextLine();
				System.err.print("Exception: ");
				System.out.printf("%s\n",e);
				System.out.println("You must enter integers!\n");
				
			}
			
			catch(ArithmeticException e) {
				System.err.print("Exception: ");
				System.out.printf("%s\n",e);
				System.out.println("Cannot divide by zero.\n");
			}
			
			
		} while(continueLoop);
		
	}
	
}
