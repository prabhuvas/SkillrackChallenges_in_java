package new_challenges;
import java.util.Scanner;

public class SquareRootOfEachDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.print(String.format("%.2f", Math.sqrt(Character.getNumericValue(str.charAt(i)))) +" ");
		}
	}

}

//ip:
//	2345
//op:
//	1.41 1.73 2.00 2.24
