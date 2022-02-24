package toturial_from_brocode;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// "\n"is the new line character
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();

		System.out.println("How old are you?");
		int age = scanner.nextInt();
		// to clear the "\n" in the scanner
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		
		
	}

}
