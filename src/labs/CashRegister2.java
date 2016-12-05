package labs;

import java.util.Scanner;

public class CashRegister2 {

	static double change = 0.0;
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double cost = 0.0;
		double tendered = 0.0;
		String use = "";
			
while(true){
		System.out.println('\n' + "Would you like to use the Cash Register? Y or N");
		use = kb.next();
		//stops program
		if(use.equalsIgnoreCase("n")){
			System.out.println("Cash Register has been turned off");
			kb.close();
			break;
		}
		
	//else {
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
			
				change100();
			
				change50();
			
				change20();
			
				change10();
			
				change5();
			
				change1();
			
				changequarter();
			
				changedime();
			
				changenickel();
			
				changepenny();
			}
		
	//	}

	}	

}

	
	static void change100(){
		int i = 0;
		while (change >= 100) {
			i++;
			change = change - 100;
		}
		if (i == 1) {
			System.out.print(i + " hundred dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " hundred dollar bills, ");
		}
	}
	
	static void change50(){
		int i = 0;
		while (change >= 50) {
			i++;
			change = change - 50;
		}
		if (i == 1) {
			System.out.print(i + " fifty dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " fifty dollar bills, ");
		}
	}
	
	static void change20(){
		int i = 0;
		while (change >= 20) {
			i++;
			change = change - 20;
		}
		if (i == 1) {
			System.out.print(i + " twenty dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " twenty dollar bills, ");
		}
	}
	
	static void change10(){
		int i = 0;
		while (change >= 10) {
			i++;
			change = change - 10;
		}
		if (i == 1) {
			System.out.print(i + " ten dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " ten dollar bills, ");
		}
	}
	
	static void change5(){
		int i = 0;
		while (change >= 5) {
			i++;
			change = change - 5;
		}
		if (i == 1) {
			System.out.print(i + " five dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " fives dollar bills, ");
		}
	}

	static void change1(){
		int i = 0;
		while (change >= 1) {
			i++;
			change = change - 1;
		}
		if (i == 1) {
			System.out.print(i + " one dollar bill, ");
		}
		if (i > 1) {
			System.out.print(i + " one dollar bills, ");
		}
	}

	static void changequarter(){
		int i = 0;
		while (change >= .25) {
			i++;
			change = change - .25;
		}
		if (i == 1) {
			System.out.print(i + " quarter, ");
		}
		if (i > 1) {
			System.out.print(i + " quarters, ");
		}
	}

	static void changedime(){
		int i = 0;
		while (change >= .10) {
			i++;
			change = change - .10;
		}
		if (i == 1) {
			System.out.print(i + " dime, ");
		}
		if (i > 1) {
			System.out.print(i + " dimes, ");
		}
	}

	static void changenickel(){
		int i = 0;
		while (change >= .05) {
			i++;
			change = change - .05;
		}
		if (i == 1) {
			System.out.print(i + " nickel, ");
		}
		if (i > 1) {
			System.out.print(i + " nickels, ");
		}
	}

	static void changepenny(){
		int i = 0;
		while (change >= 0.01) {
			i++;
			change = change - .01;
		}
		if (i == 1) {
			System.out.print("and " + i + " penny.");
		}
		if (i > 1) {
			System.out.print("and " + (i+1) + " pennies.");
		}
	}
}
