package skillrack_challenges;
import java.util.Scanner;

public class StringValues_first_and_last_char_same {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.charAt(0) == s2.charAt(0) && s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}
}
