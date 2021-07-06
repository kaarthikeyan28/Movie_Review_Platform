import java.util.*;

public class Admin {


	public static boolean Validate(String MovieTitle,User userobj,ArrayList<Movie> movieobj,ArrayList<String> moviesList) {
		Scanner sc = new Scanner(System.in);
		
		String ask = sc.nextLine().toLowerCase();
		
		if(ask.equals("yes")) return true;
		else return false;
}
}
