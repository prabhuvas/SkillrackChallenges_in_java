package skillrack_challenges;
import java.util.*;

public class CheckTheAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int position = sc.nextInt();
		
		char[] ch = str.toCharArray();
		String ans = check(str,position);
		System.out.print(ans);
	}
	public static String check(String str, int position) {
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)-96) == position || (str.charAt(i)-64) == position ) {
				return "yes";
				
			}
		}
		
		return "no";
	}
}
