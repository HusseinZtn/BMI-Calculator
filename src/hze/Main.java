package hze;

import java.util.Scanner;

public class Main {

	private static Scanner userinput;

	public static void main(String[] args) {

		// declare
		userinput = new Scanner(System.in);
		char gender;
		double height, weight;

		// Input
		System.out.print("Please enter your birth gender (m/f): ");
		gender = userinput.next().charAt(0);

		// check if gender is male or female
		if (gender == 'f' || gender == 'm') {

			System.out.print("Please enter your height (cm): ");
			height = userinput.nextDouble();

			System.out.print("Please enter your weight (kg): ");
			weight = userinput.nextDouble();

			// height -> double | weight -> double | gender -> char
			System.out.println(Calculator.calculate(height, weight, gender));
		} else {
			System.out.println("Please choose between male (m) and female (f) or check your orthography!");
		}

	}

}
