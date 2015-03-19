import java.util.Scanner;
public class SCase {
public static void main(String [] args){
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter your role ");
	String role = keyboard.next();
	
	switch (role){
	case "Administrator": case "administrator":
		System.out.println("Welcome " + role);
		break;
	case "Faculty": case "faculty":
		System.out.println("Welcome " + role);
		break;
	case "Staff": case "staff":
		System.out.println("Welcome " + role);
		break;
	case "Student": case "student":
		System.out.println("Welcome " + role);
		break;
	case "Guest": case "guest":
		System.out.println("Welcome " + role);
		break;
		default:
			System.out.println("Not a valid role");
			
		
	}
}

}
