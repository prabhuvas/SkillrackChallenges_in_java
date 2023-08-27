package new_challenges;
import java.util.Scanner;

public class TrianglePattern_MultipleOfX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sarr = sc.nextLine().split(" ");
		int num = 1;
		for(int i=0; i<Integer.parseInt(sarr[0]); i++) {
			for(int j=0; j<=i; j++) {
				if(num%Integer.parseInt(sarr[1])==0) {
					System.out.print("* ");
				}
				else {
					System.out.print(num+" ");
				}
				num++;
			}
			System.out.println();
		}
	}

}

//(N=4, X=5)
//ip:
//	4 5
//op:
//	1
//	2 3
//	4 * 6
//	7 8 9 *