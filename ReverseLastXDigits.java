package skillrack_challenges;
import java.util.Scanner;

public class ReverseLastXDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		int lastx = sc.nextInt();
		int ok = sen.length()-lastx;
		
		char[] ch = sen.toCharArray();
		for(int i=0; i<ok; i++) {
			System.out.print(ch[i]);
		}
//		System.out.println();
		int count=0;
		for(int j=sen.length()-1; j>0; j--) {
			count++;
			System.out.print(ch[j]);
			if(count==lastx) {
				break;
			}
		}
	}
}
