package main;

import java.util.Scanner;

public class Converter {

	public static int menuSelection() {

		int selection;
		Scanner input = new Scanner(System.in);

		System.out.println("Please Select an option:");
		System.out.println("-------------------------\n");
		System.out.println("1 - Miles to Kilometers");
		System.out.println("2 - Inches to Feet");
		System.out.println("3 - Centimeters to Inches");
		System.out.println("4 - Quit");

		selection = input.nextInt();
		return selection;
	}

	public static void menuOne() {
		Scanner input = new Scanner(System.in);
		int pick = input.nextInt();
		System.out.println(pick * 1.609);
	}

	public static void menuTwo() {
		Scanner input = new Scanner(System.in);
		int pick = input.nextInt();
		System.out.println(pick * 12);
	}

	public static void menuThree() {
		Scanner input = new Scanner(System.in);
		int pick = input.nextInt();
		System.out.println(pick / 2.54);
	}

	public static void main(String[] args) {
		int choice;

		choice = menuSelection();

		while (choice != 4) {
			System.out.println("Please insert number: ");
			switch (choice) {
			case 1:
				menuOne();
				System.out.println("Miles to Kilometers");
				break;
			case 2:
				menuTwo();
				System.out.println("Inches to Feet");
				break;
			case 3:
				menuThree();
				System.out.println("Centimeters to Inches");
				break;
			case 4:
				break;
			}
		}

	}
}
