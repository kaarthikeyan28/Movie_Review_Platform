import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter no of Viewers");
		int viewers = sc.nextInt();
		int[] viewersArray = new int[viewers];
		
		System.out.println("Enter no of Critics");
		int critics = sc.nextInt();
		int[] criticsArray = new int[viewers];
		
		int viewsum=0;
		int criticsum=0;
		
		System.out.println("Enter Viewers Score");
		for(int iter=0;iter<viewers;iter++) {
			System.out.println("Viewer"+iter+":");
			viewersArray[iter] = sc.nextInt();
			viewsum=viewsum+viewersArray[iter];
		}
		
		
		System.out.println("Enter Critics Score");
		for(int iter=0;iter<critics;iter++) {
			System.out.println("Critics"+iter+":");
			criticsArray[iter] = sc.nextInt();
			criticsum=criticsum+criticsArray[iter];
		}
		
		
		double view_average = viewsum / viewers;
		
		double crictic_average = criticsum/critics;
		
		crictic_average = crictic_average * 2.00;
		
		double total_avearge = crictic_average/2.0;
		
		System.out.println(crictic_average);
		
	}

}
