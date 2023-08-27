package skillrack_challenges;
import java.util.Scanner;

public class Binary_Representation_Squares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String temp="";
		for(int i=1; i<=n; i++) {
			int t1 = i*i;
			temp="";
			while(t1!=0) {
				temp += t1%2;
				t1 /= 2;
			}
			for(int j=temp.length()-1; j>=0; j--) {
				System.out.print(temp.charAt(j));
			}
			System.out.print(" ");
		}

	}

}

//ip:4
//op:1 100 1001 10000
//exp:
//	1 square is 1 = 1
//	2 square is 4 = 100
//	3 square is 9 = 1001
//	4 square is 16 = 10000
