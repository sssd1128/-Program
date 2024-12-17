package Factory;
import java.util.Scanner;
public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
        	long factorial = 1;
            int i = number;
            while (i > 0) {
                factorial *= i;
                i--;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        scanner.close();
        }

	}


