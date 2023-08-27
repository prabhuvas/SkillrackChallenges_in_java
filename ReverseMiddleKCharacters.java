package skillrack_challenges;
import java.util.Scanner;

public class ReverseMiddleKCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//acknowledgement = 15
		int num = sc.nextInt();
		int mid = (str.length()-num)/2;
		for(int i=0; i<mid; i++) {
			System.out.print(str.charAt(i));
		}
		
		for(int i=(mid+num)-1; i>=mid; i--) {
			System.out.print(str.charAt(i));
		}
		
		for(int i=mid+num; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}
