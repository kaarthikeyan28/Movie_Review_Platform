
public class User {

	private String UserName;
	private String UserEmail;
	private String UserPassword;
	private String UserType;
	
	
	User(){
		
	}
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserType(){
		return this.UserType;
	}
	public void setUserType(String critics) {
		UserType = critics;
	}
	
	
	public void HomeScreen() {
		System.out.println("Welcome !");
	}
	
	
	
	
}
