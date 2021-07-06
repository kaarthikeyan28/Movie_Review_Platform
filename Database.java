import java.util.*;

public class Database {

	public static ArrayList<User> userList = new ArrayList<>();
	User u = new User();
	Database(String UserName,String email,String Password){
		u.setUserName(UserName);
		u.setUserPassword(Password);
		u.setUserEmail(email);
		
		userList.add(u);
	}
	
	
//	public String toString(User u) {
//		return u.getUserName()+" "+u.getUserEmail()+" "+u.getUserPassword();
//	}
	
	
	public static boolean UserEmailSearch(String search){
		for(User temp:userList) {
			if(search.equals(temp.getUserEmail())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean UserPasswordSearch(String search) {
		for(User temp:userList) {
			if(search.equals(temp.getUserPassword())) {
				return true;
			}
		}
		return false;
	}
	
	public static void display() {
		for(User temp:userList) {
			System.out.println(temp.getUserName());
		}
	}
	
	
//	public static void SignUp(String username,String Email,String Password) {
//		Scanner sc = new Scanner(System.in);
//		
//		u.setUserName(username);
//		u.setUserEmail(Email);
//		u.setUserPassword(Password);
//		
//		userList.add(u);
//	
//	}
	
	public static void UserType() {
		
		System.out.println("Are you a User / Admin\n");
		System.out.println("Please Type User or Admin");
		
		Scanner sc = new Scanner(System.in);
		
		String UserInput = sc.nextLine().toLowerCase();
		
		boolean flag;
		do {
				flag=true;
				if(UserInput.equals("user")) {
					UserLogin();
				}
				else if(UserInput.equals("admin")) {
					AdminLogin();
				}
				else {
					System.err.println("Invalid !");
				}
				
		}while(flag!=true);
		
	}

	
	public static void UserLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Already a member ? \n");
		System.out.println("Please type Yes / No\n");
		
		
		String UserLogin = sc.nextLine().toLowerCase();
		
		
		boolean flag;
		if(UserLogin.equals("yes")) {
			do {
			 flag=true;
			 System.out.println("Plaese Enter Your Email ID:\n");
			 String UserEmail = sc.nextLine();
			 
			 if(UserEmailSearch(UserEmail)) {
				 System.out.println("Please Enter Your Password:\n");
				 String UserPassword = sc.nextLine();

					 if(UserPasswordSearch(UserPassword)) {
//						 	u.HomeScreen();
						 System.out.println("Welcome da");
					 }
					 else {
						 System.err.println(" Your Password Doesn't MAtch :( ");
						 flag=false;
					 }
			 }
			 else {
				 System.err.println("Please enter correct Email ID");
				 flag=false;
			 }
			 
			}while(flag!=true);	
		}
		
	}
	
	
	public static void AdminLogin() {
		System.out.println();
		
	}
	
}
