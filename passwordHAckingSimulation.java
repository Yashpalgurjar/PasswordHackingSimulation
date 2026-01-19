package high.concept;
import java.util.Scanner;
public class passwordHAckingSimulation {

	public static void main(String[] args)  {
		Scanner sc = new Scanner (System.in);
				String correctPassword = "yashpal@123";
		 String inputPassword;
		 int attempt = 3;
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  
		  
		  while (attempt > 0) {
			  
			  System.out.println( "welcome to FBI" );
			  System.out.println("enter password");
			  inputPassword = sc.nextLine();
			  
			  if (inputPassword.equals(correctPassword)){
				  System.out.println("system access");
				  System.out.println("welcome MR ROBOT");
				  break;
				  
			  }  else {
		                attempt--;
		                System.out.println("system not access ");
		               
		               	System.out.println("Attempts Left: " + attempt);

			  }  if (attempt == 0) {
		        System.out.println("\nSYSTEM LOCKED ");

			  }
			  
		  }
		
	}
}
		
		
	

