package arithmeticCalculator;

import java.util.Scanner;

public class Calculator {
    
	/**
	 * This method will add 2 numbers
	 */
	public static void add(int a, int b) {

		System.out.println(a + b);
	}
	/**
	 * This method will subtract 2 numbers
	 */
	public static void subtract(int a, int b) {

	}
	
	/**
	 * This method will Multiply 2 numbers
	 */
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
    
	/**
	 * This method will Divide 2 numbers
	 */
	public static void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a,b;
		char ch;
		while (true) {
			try {
				System.out.println(
						"Select your operation: +(Addition) or -(Subtraction) or *(Multiplication) or /(Division) or to exit press 0");
				ch = obj.next().charAt(0);
				switch (ch) {
				case '+':
					System.out.println("Enter 2 numbers:");
					a = obj.nextInt();
					b = obj.nextInt();
					add(a, b);
					break;
				case '-':
					System.out.println("Enter 2 numbers:");
					a = obj.nextInt();
					b = obj.nextInt();
					subtract(a, b);
					break;
				case '*':
					System.out.println("Enter 2 numbers:");
					a = obj.nextInt();
					b = obj.nextInt();
					multiply(a, b);
					break;
				case '/':
					System.out.println("Enter 2 numbers:");
					a = obj.nextInt();
					b = obj.nextInt();
					divide(a, b);
					break;
				case '0':
					System.out.println("Thank You for using");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter valid operation given");
					break;
				}
			} catch (Exception ex) {
				System.out.println("Some Error Ocuurred");
				ex.printStackTrace();
				System.exit(0);
			}

		}
	}
}