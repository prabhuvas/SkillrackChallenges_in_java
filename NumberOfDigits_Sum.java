package skillrack_challenges;
import java.util.Scanner;

public class NumberOfDigits_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x+y;
		String str = Integer.toString(sum);
		System.out.print((str.length() == x)? sum : x);

	}

}
