package skillrack_challenges;
import java.util.Scanner;

public class ProductOfX_and_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int rem=0;
		while(x!=0) {
			rem += x%10;
			x /= 10;
		}
		System.out.print(rem*y);
	}

}

//ip:
//	2345
//	4
//op:
//	56
//exp:
//	2+3+4+5 = 14
//	14 * 4 = 56