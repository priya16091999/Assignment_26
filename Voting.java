package assignment_26;
import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
		int age;
		Boolean citizen = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = sc.nextInt();
		System.out.println("Are you the citizen");
		System.out.println("True or False ?");
		citizen = sc.nextBoolean();

		if (age > 18 && citizen == true)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");
	}

}
