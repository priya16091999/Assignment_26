package assignment_26;
import java.util.Scanner;
public class Weathercondition {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		boolean raining;
		float temp;
		System.out.println("Enter temp in C");
		temp=sc.nextFloat();
		System.out.println("raining? (true/false)");
		raining=sc.nextBoolean();
		if(temp>=20 &&  temp <=30 && !raining) {
			System.out.println("to go outside");
		}
			else
			{
				System.out.println("not go to outside");
			}
		}
	}


