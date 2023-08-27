package skillrack_challenges;
import java.util.*;

public class ReverseLastXCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = sc.nextInt();
		
		int ok = str.length()-num;
		
		for(int i=0; i<ok; i++) {
			System.out.print(str.charAt(i));
		}
		
		for(int j=str.length()-1; j>=ok; j--) {
			System.out.print(str.charAt(j));
		}
	}
}
