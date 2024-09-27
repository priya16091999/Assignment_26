package assignment_26;

import java.util.Scanner;

public class Examgrading {

	public static void main(String[] args) {

		int s1, s2, s3;
		int tot, avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 3 subjects");
		System.out.println("Enter marks for 1st subject");
		s1 = sc.nextInt();
		System.out.println("Enter marks for 2nd subject");
		s2 = sc.nextInt();
		System.out.println("Enter marks for 3rd subject");
		s3 = sc.nextInt();

		tot = s1 + s2 + s3;
		avg = tot / 3;

		if (s1 > 40 && s2 > 40 && s3 > 40 && avg >= 60)
			System.out.println(" Student is Passed");
		else
			System.out.println("Student is Failed");
	}
	
}
