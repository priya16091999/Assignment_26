package assignment_26;

public class Dooraccess {
	

		public static void main(String[] args) {
			
			boolean validId=true;
			boolean validCard=true;
			boolean isAdmin=true;
			
			if((validId && validCard) || isAdmin)
				System.out.println("Access Granted");
			else
				System.out.println("Access Denied");
		}

}

