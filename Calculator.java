package programs;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter operand 1: ");
		int n1 = o.nextInt();
		System.out.println("Enter operand 2: ");
		int n2 = o.nextInt();
		o.nextLine();
		System.out.println("Enter operation name(add,subtract,multiply,divide,remainder): ");
		String op = o.nextLine();
		switch(op) {
		case "add":
			System.out.println("Addition: " + (n1+n2));
			break;
		
		case "subtract":
			System.out.println("Subtraction: " + (n1-n2));
			break;
		
		case "multiply":
			System.out.println("Multiplication: " + (n1*n2));
			break;
		
		case "divide":
			System.out.println("Division: " + (n1/n2));
			break;
		
		case "remainder":
			System.out.println("Remainder: " + (n1%n2));
			break;
			
		}
		o.close();
	}
}
