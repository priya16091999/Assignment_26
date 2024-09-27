package assignment_26;

import java.util.Scanner;

public class Ageincome {

	public static void main(String[] args) {

		int age;
		double income;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age and Income");
		age = sc.nextInt();
		income = sc.nextDouble();

		if (age >= 18 && age <= 60 && income > 25000)
			System.out.println("Person is eligible for Loan");
		else
			System.out.println("Person is not eligible for loan");
	}

}
