package skillrack_challenges;
import java.util.*;

public class ReverseFirst3digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		String str = Integer.toString(num);
		char[] ch = str.toCharArray();
		String res="";
		for(int i=3-1; i>=0; i--) {
			res += ch[i];
		}
		System.out.print(Integer.parseInt(res));
	}
}
