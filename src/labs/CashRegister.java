package labs;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		double cost = 0.0;
		double tendered = 0.0;
		double change = 0.0;


		System.out.println("How much does the item cost?");
		cost = kb.nextDouble();
		System.out.println("How much money was tendered?");
		tendered = kb.nextDouble();
		change = tendered - cost;
		// test for change and amounts given
		// System.out.println("cost is: " + cost + ". Money given is " +
		// tendered + ". Change is: " + change);

		if (tendered < cost) {
			System.out.println("Not enough money was given");
		}

		if (tendered == cost) {
			System.out.println("Exact amount was paid. No Change.");
		}

		if (tendered > cost) {
			System.out.print("The change given is: ");
			
			while (change >= 20) {
				change = change - 20;
				twenty = twenty + 1;
			}
			if (twenty == 1) {
				System.out.print(twenty + " twenty dollar bill, ");
			}
			if (twenty > 1) {
				System.out.print(twenty + " twenty dollar bills, ");
			}

			while (change >= 10) {
				change = change - 10;
				ten = ten + 1;
			}
			if (ten > 0) {
				System.out.print(ten + " ten dollar bill, ");
			}

			while (change >= 5) {
				change = change - 5;
				five = five + 1;
			}
			if (five > 0) {
				System.out.print(five + " five dollar bill, ");
			}
			
			while (change >= 1) {
				change = change - 1;
				one = one + 1;
			}
			if (one == 1) {
				System.out.print(one + " one dollar bill, ");
			}
			if (one > 1 ){	
				System.out.print(one + " one dollar bills, ");
			}
			
			while (change >= .25) {
				change = change - .25;
				quarter = quarter + 1;
			}
			if (quarter == 1) {
				System.out.print(quarter + " quarter, ");
			}
			if (quarter > 1) {
				System.out.print(quarter + " quarters, ");
			}
			
			while (change >= .10) {
				change = change - .10;
				dime = dime + 1;
			}
			if (dime == 1) {
				System.out.print(dime + " dime, ");
			}
			if (dime > 1) {
				System.out.print(dime + " dimes, ");
			}
			
			while (change >= .05) {
				change = change - .05;
				nickel = nickel + 1;
			}
			if (nickel > 0) {
				System.out.print(nickel + " nickle, ");

			}
			
			while (change >= .01) {
				change = change - .01;
				penny = penny + 1;
			}
			if (penny == 1) {
				System.out.print( "and " + penny + " penny.");
			}
			if (penny > 1) {
				System.out.print("and " + (penny+1) + " pennies.");
			}
			
		}
	}

}
