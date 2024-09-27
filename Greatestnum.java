package assignment_26;
import java.util.Scanner;
public class Greatestnum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num1,num2,num3,greatest;
		System.out.println("Enter 1st number");
		num1 =sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 =sc.nextInt();
		System.out.println("Enter 3rd number");
		num3 =sc.nextInt();
		greatest= (num1>num2)?(num1>num3 ?num1:num3)
				:(num2>num3 ? num2:num3);
		System.out.println("greatest is"+greatest);
	}

}
