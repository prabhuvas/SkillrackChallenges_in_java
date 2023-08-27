package skillrack_challenges;
import java.util.Scanner;

public class TriangleDigitPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				if(i==j || j<=i) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
