package skillrack_challenges;
import java.util.*;

public class firstAndlastNcharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int len = str.length();
		System.out.print(str.substring(0,n)+""+str.substring(len-n,len));
	}
}
