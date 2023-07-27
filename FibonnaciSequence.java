package FibonnaciSequence;

import java.util.Scanner;

public class FibonnaciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputValue;

		try {
			System.out.println("Enter a positive number: ");
			inputValue = Integer.parseInt(sc.nextLine());

			if (inputValue < 1) {
				throw new IllegalArgumentException("Input value should be greater than zero");
			}

			// call function
			printFibonacci(inputValue);

		} catch (NumberFormatException e) {
			System.err.println("Please enter a positive number ");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

	public static void printFibonacci(int num) {
		System.out.println("Fibonacci seq upto " + num + ": ");
		int previous = 0;
		int current = 1;
		int next;

		System.out.print(previous + " ");

		while (current <= num) {
			System.out.print(current + " ");
			next = previous + current;
			previous = current;
			current = next;
		}

		System.out.println();
	}

}
