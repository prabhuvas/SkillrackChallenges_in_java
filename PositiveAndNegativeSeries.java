package skillrack_challenges;
import java.util.Scanner;

public class PositiveAndNegativeSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd=0,even=0;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		
		int ans = odd-even;
		System.out.print(ans);
	}
}
