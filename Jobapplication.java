package assignment_26;
import java.util.Scanner;
public class Jobapplication {


		public static void main(String[] args) {
			int degree=1;
			int exp=1;
			int criminal=0;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("For yes press 1 and for No press 0");
			System.out.println("Have you done degree");
			degree=sc.nextInt();
			System.out.println("you have experiance");
			exp=sc.nextInt();
			System.out.println("yo have  any  criminal record");
			criminal=sc.nextInt();
			if((degree==1 || exp == 1) && criminal ==0 )
				System.out.println("eligible for job");
			else
				System.out.println("not eligible for job ");
		}

	}


