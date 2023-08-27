package skillrack_challenges;
import java.util.Scanner;

public class Prime_or_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		for(int i=2; i<n/2; i++) {
			if(n%i==0) {
				flag=1;
				break;
				
			}
		}
		
		if(n%2==0 || flag==0) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}
	
}
