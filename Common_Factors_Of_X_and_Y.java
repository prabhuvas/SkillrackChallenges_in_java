package new_challenges;
import java.util.Scanner;

public class Common_Factors_Of_X_and_Y {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int max = Math.max(x, y);
		for(int i=1; i<=max; i++) {
			if(x%i==0 && y%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}

//ip:
//	24 96
//op:
//	1 2 3 4 6 8 12 24
//exp:
//	factors of 24 is 1,2,3,4,6,8,12,24
//	factors of 96 is 1,2,3,4,6,8,12,24,32,48,96
//	common factors are 1,2,3,4,6,8,12,24
//
//ip:
//	13 19
//op:
//	1